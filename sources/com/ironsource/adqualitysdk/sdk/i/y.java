package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y<T> extends w<WebView, T> {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private is f3210;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private aa f3211;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Map<T, aa> f3212 = new WeakHashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private y<T>.c f3213 = new c();

    public class c {

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private boolean f3224;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3225;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3226;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3227;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3228;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3229;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3230;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private List<String> f3231;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f3232;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        protected List<String> f3233 = new ArrayList();

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3234;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public final y<T>.c m7371(boolean z10) {
            this.f3228 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public final y<T>.c m7372(boolean z10) {
            this.f3224 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public final y<T>.c m7373(boolean z10) {
            this.f3226 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final y<T>.c m7374(boolean z10) {
            this.f3227 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final y<T>.c m7375(boolean z10) {
            this.f3229 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m7376(String str) {
            this.f3230 = str;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final y<T>.c m7380(boolean z10) {
            this.f3225 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final y<T>.c m7381(boolean z10) {
            this.f3232 = z10;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m7377(List<String> list) {
            this.f3231 = list;
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final y<T>.c m7379(List<String> list) {
            if (list != null) {
                this.f3233 = list;
            }
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final y<T>.c m7378(boolean z10) {
            this.f3234 = z10;
            return this;
        }
    }

    public y(is isVar) {
        this.f3210 = isVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    final void m7357(y<T>.c cVar) {
        this.f3213 = cVar;
    }

    /* JADX INFO: renamed from: ﻐ */
    abstract void mo4574(T t10, List<WebView> list);

    /* JADX INFO: renamed from: ｋ */
    abstract r<WebView, T> mo4578();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ */
    public final /* synthetic */ void mo4550(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo4555(jSONObject, (WebView) obj, obj2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ */
    protected final String mo4551(T t10) {
        return (((c) this.f3213).f3228 ? this.f3212.get(t10) : this.f3211).mo4551(t10);
    }

    /* JADX INFO: renamed from: ﾒ */
    abstract View mo4579(T t10);

    /* JADX INFO: renamed from: ﾒ */
    abstract aa mo4580();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    final void m7358(final JSONObject jSONObject, final T t10, String str) {
        boolean z10 = ((c) this.f3213).f3232 && !TextUtils.isEmpty(((c) this.f3213).f3230);
        aa aaVarMo4580 = ((c) this.f3213).f3228 ? this.f3212.get(t10) : this.f3211;
        if (aaVarMo4580 == null) {
            aaVarMo4580 = mo4580();
            if (((c) this.f3213).f3228) {
                this.f3212.put(t10, aaVarMo4580);
            } else {
                this.f3211 = aaVarMo4580;
            }
            aaVarMo4580.m7339(mo4578());
        }
        aa aaVar = aaVarMo4580;
        aaVar.m4548();
        aaVar.m4549(((c) this.f3213).f3230, ((c) this.f3213).f3231, z10, ((c) this.f3213).f3225, ((c) this.f3213).f3226);
        aaVar.m4553(str);
        if (!((c) this.f3213).f3227) {
            super.mo4550(jSONObject, null, t10);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo4574(t10, arrayList);
        List<WebView> arrayList2 = new ArrayList<>();
        is isVar = this.f3210;
        if (isVar != null) {
            arrayList2 = isVar.mo6025(t10);
        }
        final List<WebView> listM7071 = jx.m7071(arrayList, arrayList2);
        if (listM7071.isEmpty() || ((c) this.f3213).f3229) {
            View viewMo4579 = mo4579(t10);
            if (viewMo4579 != null) {
                viewMo4579.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f3218 = 1;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f3221;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char[] f3220 = {17530, 11140, 39882, 2871, 64379, 27486, 55936, 19138, 14897, 43623, 6783, 35223, 31208, 59700, 22884, 51547, 47232, 10436, 38948, 47235, 55161, 26414, 63438, 1920, 38887, 9825, 46643, 50830, 22172, 59050, 30021, 34107, 5590, 42399, 13744, 17506, 54296, 25796, 62608, 1196, 37744, 9021};

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static long f3219 = -5459287922733060147L;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m7360(int i10, int i11, char c10) {
                        String str2;
                        synchronized (d.f1677) {
                            try {
                                char[] cArr = new char[i10];
                                d.f1676 = 0;
                                while (true) {
                                    int i12 = d.f1676;
                                    if (i12 < i10) {
                                        cArr[i12] = (char) ((((long) f3220[i11 + i12]) ^ (((long) i12) * f3219)) ^ ((long) c10));
                                        d.f1676 = i12 + 1;
                                    } else {
                                        str2 = new String(cArr);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            y.this.mo4574(t10, arrayList3);
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            f3218 = (f3221 + 23) % 128;
                            View viewMo45792 = y.this.mo4579(t10);
                            if (viewMo45792 != null) {
                                int i18 = f3218 + 77;
                                f3221 = i18 % 128;
                                if (i18 % 2 != 0) {
                                    boolean unused = y.this.f3213.f3229;
                                    throw null;
                                }
                                if (!y.this.f3213.f3229) {
                                    viewMo45792.removeOnLayoutChangeListener(this);
                                }
                            }
                            y.this.m7355(t10, arrayList3);
                            y.this.mo5991(new JSONObject(), arrayList3.get(0), t10);
                        } catch (Throwable th2) {
                            kd.m7160(m7360(19 - (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 17468)).intern(), m7360((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, TextUtils.lastIndexOf("", '0') + 20, (char) (47302 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), th2, false);
                        }
                    }
                });
            }
            if (listM7071.isEmpty()) {
                super.mo4550(jSONObject, null, t10);
                return;
            }
        }
        if (((c) this.f3213).f3224) {
            t.m7289().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
                @Override // java.lang.Runnable
                public final void run() {
                    y.this.m7355(t10, (List<WebView>) listM7071);
                    y.super.mo4550(jSONObject, (WebView) listM7071.get(0), t10);
                }
            });
        } else {
            m7355(t10, listM7071);
            super.mo4550(jSONObject, listM7071.get(0), t10);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    final void m7359(is isVar) {
        this.f3210 = isVar;
    }

    /* JADX INFO: renamed from: ｋ */
    void mo7317(T t10, String str) {
        m7358(new JSONObject(), (Object) t10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public void m7355(T t10, List<WebView> list) {
        aa aaVar;
        aa aaVar2;
        if (((c) this.f3213).f3228) {
            aaVar = this.f3212.get(t10);
        } else {
            aaVar = this.f3211;
        }
        aaVar.m4547(list);
        if (((c) this.f3213).f3234) {
            if (((c) this.f3213).f3228) {
                aaVar2 = this.f3212.get(t10);
            } else {
                aaVar2 = this.f3211;
            }
            aaVar2.m4553(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    void mo7315(T t10) {
        aa aaVar;
        JSONObject jSONObject = new JSONObject();
        if (((c) this.f3213).f3228) {
            aaVar = this.f3212.get(t10);
        } else {
            aaVar = this.f3211;
        }
        mo5994(jSONObject, aaVar.m4545(), t10);
    }
}
