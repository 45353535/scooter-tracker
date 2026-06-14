package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* JADX INFO: loaded from: classes3.dex */
public class ViewableImpression {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Attribute
    private String f96087id;

    @Tag("NotViewable")
    private List<NotViewable> notViewableList;

    @Tag("ViewUndetermined")
    private List<ViewUndetermined> viewUndeterminedList;

    @Tag("Viewable")
    private List<Viewable> viewableList;

    public String getId() {
        return this.f96087id;
    }

    public List<NotViewable> getNotViewableList() {
        return this.notViewableList;
    }

    public List<ViewUndetermined> getViewUndeterminedList() {
        return this.viewUndeterminedList;
    }

    public List<Viewable> getViewableList() {
        return this.viewableList;
    }
}
