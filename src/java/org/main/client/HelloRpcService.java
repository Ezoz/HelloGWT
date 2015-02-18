package org.main.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("hellorpcservice")
public interface HelloRpcService extends RemoteService {

    public String myMethod();
}
