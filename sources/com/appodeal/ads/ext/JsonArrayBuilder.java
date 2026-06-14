package com.appodeal.ads.ext;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/appodeal/ads/ext/JsonArrayBuilder;", "", "<init>", "()V", "", "value", "", "putValues", "(Ljava/util/List;)V", "Lorg/json/JSONArray;", "build", "()Lorg/json/JSONArray;", "ext_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JsonArrayBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONArray f13296a = new JSONArray();

    /* JADX INFO: renamed from: build, reason: from getter */
    public final JSONArray getF13296a() {
        return this.f13296a;
    }

    public final void putValues(List<? extends Object> value) {
        if (value == null) {
            return;
        }
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            this.f13296a.put(it.next());
        }
    }
}
