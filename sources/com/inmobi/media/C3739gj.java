package com.inmobi.media;

import com.inmobi.media.C3739gj;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.inmobi.media.gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3739gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3878m9 f38653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38654b = 101;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38655c = CollectionsKt.arrayListOf(101);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f38656d;

    public C3739gj(InterfaceC3878m9 interfaceC3878m9) {
        this.f38653a = interfaceC3878m9;
        List listListOf = CollectionsKt.listOf((Object[]) new C4188yk[]{new C4188yk(101, 1, 102, new Function0() { // from class: w3.g7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.a(this.f107064b);
            }
        }), new C4188yk(101, 4, 104, new Function0() { // from class: w3.h7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.b(this.f107082b);
            }
        }), new C4188yk(102, 2, 103, new Function0() { // from class: w3.i7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.l(this.f107101b);
            }
        }), new C4188yk(102, 3, 104, new Function0() { // from class: w3.j7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.m(this.f107119b);
            }
        }), new C4188yk(102, 4, 104, new Function0() { // from class: w3.k7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.n(this.f107140b);
            }
        }), new C4188yk(102, 8, 107, new Function0() { // from class: w3.l7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.o(this.f107164b);
            }
        }), new C4188yk(102, 5, 105, new Function0() { // from class: w3.m7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.p(this.f107185b);
            }
        }), new C4188yk(103, 5, 105, new Function0() { // from class: w3.n7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.q(this.f107205b);
            }
        }), new C4188yk(106, 5, 105, new Function0() { // from class: w3.o7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.r(this.f107224b);
            }
        }), new C4188yk(106, 7, 105, new Function0() { // from class: w3.p7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.s(this.f107241b);
            }
        }), new C4188yk(103, 8, 107, new Function0() { // from class: w3.q7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.c(this.f107263b);
            }
        }), new C4188yk(103, 4, 104, new Function0() { // from class: w3.r7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.d(this.f107278b);
            }
        }), new C4188yk(106, 2, 106, new Function0() { // from class: w3.s7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.e(this.f107298b);
            }
        }), new C4188yk(106, 4, 104, new Function0() { // from class: w3.t7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.f(this.f107322b);
            }
        }), new C4188yk(106, 8, 107, new Function0() { // from class: w3.u7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.g(this.f107334b);
            }
        }), new C4188yk(104, 8, 107, new Function0() { // from class: w3.v7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.h(this.f107349b);
            }
        }), new C4188yk(105, 7, 106, new Function0() { // from class: w3.w7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.i(this.f107365b);
            }
        }), new C4188yk(105, 4, 104, new Function0() { // from class: w3.x7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.j(this.f107379b);
            }
        }), new C4188yk(105, 2, 105, new Function0() { // from class: w3.y7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3739gj.k(this.f107397b);
            }
        })});
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            C4188yk c4188yk = (C4188yk) obj;
            linkedHashMap.put(TuplesKt.to(Integer.valueOf(c4188yk.f40012a), Integer.valueOf(c4188yk.f40013b)), obj);
        }
        this.f38656d = linkedHashMap;
    }

    public static final Unit a(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "SDK loads HTML in EndCardWebView");
        }
        return Unit.f93236a;
    }

    public static final Unit b(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "Error: Render process gone from IDLE");
        }
        return Unit.f93236a;
    }

    public static final Unit c(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "WebView destroyed from LOADED");
        }
        return Unit.f93236a;
    }

    public static final Unit d(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "Error: WebView load FAILED due to Render Process Gone from LOADED");
        }
        return Unit.f93236a;
    }

    public static final Unit e(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "FireAdReady came in shown and Invisible state, no change in state");
        }
        return Unit.f93236a;
    }

    public static final Unit f(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "Error: Render process gone from INVISIBLE");
        }
        return Unit.f93236a;
    }

    public static final Unit g(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "WebView destroyed when it is not visible");
        }
        return Unit.f93236a;
    }

    public static final Unit h(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "WebView destroyed from FAILED");
        }
        return Unit.f93236a;
    }

    public static final Unit i(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "WebView invisible from SHOWN");
        }
        return Unit.f93236a;
    }

    public static final Unit j(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "Error: Render process gone from SHOWN");
        }
        return Unit.f93236a;
    }

    public static final Unit k(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "FireAdReady came in SHOWN state, no change in state");
        }
        return Unit.f93236a;
    }

    public static final Unit l(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", " Fire Ad ready from LOADING");
        }
        return Unit.f93236a;
    }

    public static final Unit m(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", " Fire Ad failed from LOADING");
        }
        return Unit.f93236a;
    }

    public static final Unit n(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "Error: Render process gone from LOADING");
        }
        return Unit.f93236a;
    }

    public static final Unit o(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", " WebView destroyed from LOADING");
        }
        return Unit.f93236a;
    }

    public static final Unit p(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", " WebView Show called and started rendering from LOADING");
        }
        return Unit.f93236a;
    }

    public static final Unit q(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "WebView Show called and started rendering from LOADED");
        }
        return Unit.f93236a;
    }

    public static final Unit r(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "WebView Show called on a view part of viewHierarchy but not on top");
        }
        return Unit.f93236a;
    }

    public static final Unit s(C3739gj c3739gj) {
        InterfaceC3878m9 interfaceC3878m9 = c3739gj.f38653a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("StateMachine", "Focus changed from Invisible to show");
        }
        return Unit.f93236a;
    }

    public final Integer a(int i10) {
        String str;
        C4188yk c4188yk = (C4188yk) this.f38656d.get(TuplesKt.to(Integer.valueOf(this.f38654b), Integer.valueOf(i10)));
        if (c4188yk != null) {
            c4188yk.f40015d.invoke();
            Map map = AbstractC3764hj.f38720a;
            int i11 = this.f38654b;
            Map map2 = AbstractC3764hj.f38720a;
            String str2 = (String) map2.get(Integer.valueOf(i11));
            switch (i10) {
                case 1:
                    str = "IMRAID_LOAD_WEBVIEW";
                    break;
                case 2:
                    str = "FIRE_AD_READY";
                    break;
                case 3:
                    str = "FIRE_AD_FAILED";
                    break;
                case 4:
                    str = "ON_RENDER_PROCESS_GONE";
                    break;
                case 5:
                    str = "SHOW_WEBVIEW";
                    break;
                case 6:
                    str = "IMRAID_RENDERED";
                    break;
                case 7:
                    str = "IMRAID_FOCUS_CHANGE";
                    break;
                case 8:
                    str = "IMRAID_DESTROY_WEBVIEW";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            System.out.println((Object) ("Transition: " + str2 + " --[" + str + "]--> " + ((String) map2.get(Integer.valueOf(c4188yk.f40014c)))));
            this.f38655c.add(Integer.valueOf(c4188yk.f40014c));
            InterfaceC3878m9 interfaceC3878m9 = this.f38653a;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a("StateMachine", "history - " + this.f38655c);
            }
            this.f38654b = c4188yk.f40014c;
            return null;
        }
        return Integer.valueOf(this.f38654b);
    }
}
