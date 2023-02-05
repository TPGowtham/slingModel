package com.adobe.core.models;
 import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SlingModel {
    @Inject
    @Named("info/.")
    public List<InfoModel> infoList;

    public List<InfoModel> getinfoList() {
        return infoList;
    }
}








