package io.sentry.protocol;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.x;
import io.sentry.t1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f83941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x f83943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f83944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f83946h;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            String strG = null;
            String strG2 = null;
            String strG3 = null;
            x xVarA = null;
            x xVarA2 = null;
            String strG4 = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "associated_event_id":
                        xVarA = new x.a().a(m3Var, iLogger);
                        break;
                    case "replay_id":
                        xVarA2 = new x.a().a(m3Var, iLogger);
                        break;
                    case "url":
                        strG4 = m3Var.G();
                        break;
                    case "name":
                        strG3 = m3Var.G();
                        break;
                    case "contact_email":
                        strG2 = m3Var.G();
                        break;
                    case "message":
                        strG = m3Var.G();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        m3Var.l0(iLogger, map, strNextName);
                        break;
                }
            }
            m3Var.endObject();
            if (strG == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.a(g7.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            h hVar = new h(strG);
            hVar.f83941c = strG2;
            hVar.f83942d = strG3;
            hVar.f83943e = xVarA;
            hVar.f83944f = xVarA2;
            hVar.f83945g = strG4;
            hVar.f83946h = map;
            return hVar;
        }
    }

    public h(String str) {
        g(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return io.sentry.util.w.a(this.f83940b, hVar.f83940b) && io.sentry.util.w.a(this.f83941c, hVar.f83941c) && io.sentry.util.w.a(this.f83942d, hVar.f83942d) && io.sentry.util.w.a(this.f83943e, hVar.f83943e) && io.sentry.util.w.a(this.f83944f, hVar.f83944f) && io.sentry.util.w.a(this.f83945g, hVar.f83945g) && io.sentry.util.w.a(this.f83946h, hVar.f83946h);
    }

    public void g(String str) {
        if (str.length() > 4096) {
            this.f83940b = str.substring(0, 4096);
        } else {
            this.f83940b = str;
        }
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83940b, this.f83941c, this.f83942d, this.f83943e, this.f83944f, this.f83945g, this.f83946h);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e(PglCryptUtils.KEY_MESSAGE).a(this.f83940b);
        if (this.f83941c != null) {
            n3Var.e("contact_email").a(this.f83941c);
        }
        if (this.f83942d != null) {
            n3Var.e("name").a(this.f83942d);
        }
        if (this.f83943e != null) {
            n3Var.e("associated_event_id");
            this.f83943e.serialize(n3Var, iLogger);
        }
        if (this.f83944f != null) {
            n3Var.e("replay_id");
            this.f83944f.serialize(n3Var, iLogger);
        }
        if (this.f83945g != null) {
            n3Var.e("url").a(this.f83945g);
        }
        Map map = this.f83946h;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83946h.get(str));
            }
        }
        n3Var.endObject();
    }

    public String toString() {
        return "Feedback{message='" + this.f83940b + "', contactEmail='" + this.f83941c + "', name='" + this.f83942d + "', associatedEventId=" + this.f83943e + ", replayId=" + this.f83944f + ", url='" + this.f83945g + "', unknown=" + this.f83946h + '}';
    }

    public h(h hVar) {
        this.f83940b = hVar.f83940b;
        this.f83941c = hVar.f83941c;
        this.f83942d = hVar.f83942d;
        this.f83943e = hVar.f83943e;
        this.f83944f = hVar.f83944f;
        this.f83945g = hVar.f83945g;
        this.f83946h = io.sentry.util.c.b(hVar.f83946h);
    }
}
