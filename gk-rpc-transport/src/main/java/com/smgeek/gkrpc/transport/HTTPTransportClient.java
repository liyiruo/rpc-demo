package com.smgeek.gkrpc.transport;

import com.smgeek.gkrpc.Peer;
import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author liyiruo
 * @data 2020/3/6  2:19 上午
 */
public class HTTPTransportClient implements TransportClient {
    private String url;

    @Override
    public void connect(Peer peer) {
        this.url = "http://" + peer.getHost() + ":" + peer.getPort();
    }

    @Override
    public InputStream write(InputStream data) {
        HttpURLConnection httpconn = null;
        InputStream inputStream = null;
        try {
            httpconn = (HttpURLConnection) new URL(url).openConnection();
            httpconn.setDoInput(true);
            httpconn.setDoOutput(true);
            httpconn.setUseCaches(false);
            httpconn.setRequestMethod("POST");

            httpconn.connect();
            IOUtils.copy(data, httpconn.getOutputStream());
            int resultCode=httpconn.getResponseCode();
            if (resultCode == HttpURLConnection.HTTP_OK) {
                return httpconn.getInputStream();
            } else {
                return httpconn.getErrorStream();
            }

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }

    @Override
    public void close() {

    }
}
