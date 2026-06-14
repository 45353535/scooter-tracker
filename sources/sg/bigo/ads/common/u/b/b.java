package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.D5;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public class b<T extends sg.bigo.ads.common.u.a> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f102737a = f.a("text/plain;charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f102738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f102739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f102740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f102741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f102742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f102743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f102744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f102745i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f102746p;

    public b(int i10, @NonNull T t10, Context context) {
        super(i10, t10, true, context);
        this.f102745i = -1;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @NonNull
    public final String a() {
        return "POST";
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final f b() {
        f fVar = this.f102740d;
        return fVar != null ? fVar : f102737a;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final byte[] c() {
        JSONObject jSONObject;
        if (this.f102739c == null && (jSONObject = this.f102738b) != null) {
            String string = jSONObject.toString();
            this.f102746p = string;
            try {
                if (this.f102741e) {
                    String strA = sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
                    if (TextUtils.isEmpty(strA)) {
                        this.f102742f = false;
                    } else {
                        this.f102742f = true;
                        this.f102746p = strA;
                        a("enc", "1");
                    }
                }
            } catch (Exception unused) {
                this.f102742f = false;
            }
            try {
                this.f102739c = this.f102746p.getBytes(D5.N);
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return this.f102739c;
    }

    @Override // sg.bigo.ads.common.u.b.c
    @Nullable
    public final String d() {
        return e() >= 0 ? this.f102746p : "content is null.";
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final int e() {
        int i10 = this.f102745i;
        if (i10 > 0) {
            return i10;
        }
        byte[] bArrC = c();
        return bArrC != null ? bArrC.length : super.e();
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final boolean f() {
        return this.f102742f;
    }

    protected final void a(Map<String, Object> map) {
        if (this.f102738b == null || k.a(map)) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                this.f102738b.putOpt(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        this.f102739c = null;
    }
}
