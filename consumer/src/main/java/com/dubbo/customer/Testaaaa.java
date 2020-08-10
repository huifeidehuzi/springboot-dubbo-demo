package com.dubbo.customer;

import com.alibaba.dubbo.common.Node;
import com.alibaba.dubbo.common.URL;

public class Testaaaa implements Node {


    URL url;

    public void setUrl(URL url){
        this. url = url;
    }

    @Override
    public URL getUrl() {
        return url;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void destroy() {

    }
}
