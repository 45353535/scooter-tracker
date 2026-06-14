package wg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f107966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f107967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f107968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f107969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f107970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f107971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f107972g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f107966a = serialName;
        this.f107967b = CollectionsKt.emptyList();
        this.f107968c = new ArrayList();
        this.f107969d = new HashSet();
        this.f107970e = new ArrayList();
        this.f107971f = new ArrayList();
        this.f107972g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, SerialDescriptor serialDescriptor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, serialDescriptor, list, z10);
    }

    public final void a(String elementName, SerialDescriptor descriptor, List annotations, boolean z10) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f107969d.add(elementName)) {
            this.f107968c.add(elementName);
            this.f107970e.add(descriptor);
            this.f107971f.add(annotations);
            this.f107972g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f107966a).toString());
    }

    public final List c() {
        return this.f107967b;
    }

    public final List d() {
        return this.f107971f;
    }

    public final List e() {
        return this.f107970e;
    }

    public final List f() {
        return this.f107968c;
    }

    public final List g() {
        return this.f107972g;
    }

    public final void h(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f107967b = list;
    }
}
