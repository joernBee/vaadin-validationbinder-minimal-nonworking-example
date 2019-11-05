package com.packagename.myapp.spring;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import org.springframework.beans.factory.annotation.Autowired;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView() {
        TextField testfield = new TextField();

        BeanValidationBinder<SampleModel> binder = new BeanValidationBinder<>(SampleModel.class);
        binder.bind(testfield, "_string");
        add(testfield);
    }

}
