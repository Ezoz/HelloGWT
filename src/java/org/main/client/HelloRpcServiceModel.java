package org.main.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlowPanel;

public class HelloRpcServiceModel extends FlowPanel {

    private Label message = new Label();
    
    public HelloRpcServiceModel() {

        add(message);
        
        final AsyncCallback<String> callback = new AsyncCallback<String>() {
            @Override
            public void onSuccess(String result) {
                message.setText(result);
                message.setStyleName("animated fadeInDown msg");
            }
            @Override
            public void onFailure(Throwable caught) {
                message.setText("Ошибка при выполнении запроса");
                message.setStyleName("err_msg");
            }
        };
        
        // вызываем метод 
        getService().myMethod(callback);
    }
    
    public static HelloRpcServiceAsync getService() {
        return GWT.create(HelloRpcService.class);
    }
}
