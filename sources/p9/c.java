package p9;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f98116a = o0.C0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f98117b = o0.C0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f98118c = o0.C0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f98119d = o0.C0(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f98120e = o0.C0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
            arrayList.add(b(spanned, fVar, 1, fVar.b()));
        }
        for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
            arrayList.add(b(spanned, hVar, 2, hVar.b()));
        }
        for (d dVar : (d[]) spanned.getSpans(0, spanned.length(), d.class)) {
            arrayList.add(b(spanned, dVar, 3, null));
        }
        for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
            arrayList.add(b(spanned, iVar, 4, iVar.b()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f98116a, spanned.getSpanStart(obj));
        bundle2.putInt(f98117b, spanned.getSpanEnd(obj));
        bundle2.putInt(f98118c, spanned.getSpanFlags(obj));
        bundle2.putInt(f98119d, i10);
        if (bundle != null) {
            bundle2.putBundle(f98120e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f98116a);
        int i11 = bundle.getInt(f98117b);
        int i12 = bundle.getInt(f98118c);
        int i13 = bundle.getInt(f98119d, -1);
        Bundle bundle2 = bundle.getBundle(f98120e);
        if (i13 == 1) {
            spannable.setSpan(f.a((Bundle) q9.a.e(bundle2)), i10, i11, i12);
            return;
        }
        if (i13 == 2) {
            spannable.setSpan(h.a((Bundle) q9.a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 3) {
            spannable.setSpan(new d(), i10, i11, i12);
        } else {
            if (i13 != 4) {
                return;
            }
            spannable.setSpan(i.a((Bundle) q9.a.e(bundle2)), i10, i11, i12);
        }
    }
}
