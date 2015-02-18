package org.main.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface HelloRpcServiceAsync {

    public void myMethod(AsyncCallback<String> callback);
}
