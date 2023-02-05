package com.adobe.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class InfoModel {

    @Inject
    private String Title;

    @Inject
    private String Description;
    @Inject
    private String Page;
    @Inject
    private String Link;

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }
    public String getPage() {
        return Page;
    }
    public String getLink() {
        return Link;
    }
}