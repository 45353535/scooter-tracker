package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import io.sentry.t1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d implements d2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f84112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f84113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f84114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f84115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f84116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f84117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f84118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f84119l;

    public static final class a implements t1 {
        private void c(e eVar, m3 m3Var, ILogger iLogger) {
            String strNextName;
            d.a aVar = new d.a();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "x":
                        eVar.f84114g = m3Var.E();
                        break;
                    case "y":
                        eVar.f84115h = m3Var.E();
                        break;
                    case "id":
                        eVar.f84113f = m3Var.nextInt();
                        break;
                    case "type":
                        eVar.f84112e = (b) m3Var.B(iLogger, new b.a());
                        break;
                    case "pointerType":
                        eVar.f84116i = m3Var.nextInt();
                        break;
                    case "pointerId":
                        eVar.f84117j = m3Var.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, strNextName, m3Var, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            m3Var.l0(iLogger, map, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            eVar.p(map);
            m3Var.endObject();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            e eVar = new e();
            b.a aVar = new b.a();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    c(eVar, m3Var, iLogger);
                } else if (!aVar.a(eVar, strNextName, m3Var, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            eVar.t(map);
            m3Var.endObject();
            return eVar;
        }
    }

    public enum b implements d2 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements t1 {
            @Override // io.sentry.t1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(m3 m3Var, ILogger iLogger) {
                return b.values()[m3Var.nextInt()];
            }
        }

        @Override // io.sentry.d2
        public void serialize(@NotNull n3 n3Var, @NotNull ILogger iLogger) throws IOException {
            n3Var.b(ordinal());
        }
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f84116i = 2;
    }

    private void o(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new d.c().a(this, n3Var, iLogger);
        n3Var.e("type").j(iLogger, this.f84112e);
        n3Var.e("id").b(this.f84113f);
        n3Var.e("x").c(this.f84114g);
        n3Var.e("y").c(this.f84115h);
        n3Var.e("pointerType").b(this.f84116i);
        n3Var.e("pointerId").b(this.f84117j);
        Map map = this.f84119l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84119l.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void p(Map map) {
        this.f84119l = map;
    }

    public void q(int i10) {
        this.f84113f = i10;
    }

    public void r(b bVar) {
        this.f84112e = bVar;
    }

    public void s(int i10) {
        this.f84117j = i10;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        new b.C1014b().a(this, n3Var, iLogger);
        n3Var.e("data");
        o(n3Var, iLogger);
        Map map = this.f84118k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84118k.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public void t(Map map) {
        this.f84118k = map;
    }

    public void u(float f10) {
        this.f84114g = f10;
    }

    public void v(float f10) {
        this.f84115h = f10;
    }
}
