package ba;

import android.net.Uri;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f6064n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f6065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f6068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f6069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f6070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final io.bidmachine.media3.common.a f6071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f6072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f6073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f6074m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f6075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f6076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f6077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f6078d;

        public a(Uri uri, io.bidmachine.media3.common.a aVar, String str, String str2) {
            this.f6075a = uri;
            this.f6076b = aVar;
            this.f6077c = str;
            this.f6078d = str2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f6079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f6080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f6081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f6082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f6083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f6084f;

        public b(Uri uri, io.bidmachine.media3.common.a aVar, String str, String str2, String str3, String str4) {
            this.f6079a = uri;
            this.f6080b = aVar;
            this.f6081c = str;
            this.f6082d = str2;
            this.f6083e = str3;
            this.f6084f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new a.b().f0("0").U("application/x-mpegURL").N(), null, null, null, null);
        }

        public b a(io.bidmachine.media3.common.a aVar) {
            return new b(this.f6079a, aVar, this.f6081c, this.f6082d, this.f6083e, this.f6084f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f6064n = new g("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public g(String str, List list, List list2, List list3, List list4, List list5, List list6, io.bidmachine.media3.common.a aVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        this.f6065d = DesugarCollections.unmodifiableList(e(list2, list3, list4, list5, list6));
        this.f6066e = DesugarCollections.unmodifiableList(list2);
        this.f6067f = DesugarCollections.unmodifiableList(list3);
        this.f6068g = DesugarCollections.unmodifiableList(list4);
        this.f6069h = DesugarCollections.unmodifiableList(list5);
        this.f6070i = DesugarCollections.unmodifiableList(list6);
        this.f6071j = aVar;
        this.f6072k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.f6073l = DesugarCollections.unmodifiableMap(map);
        this.f6074m = DesugarCollections.unmodifiableList(list8);
    }

    private static void a(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f6075a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static List c(List list, int i10, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i12);
                    if (streamKey.f80520c == i10 && streamKey.f80521d == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static g d(String str) {
        List listSingletonList = Collections.singletonList(b.b(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new g("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    private static List e(List list, List list2, List list3, List list4, List list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((b) list.get(i10)).f6079a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list2, arrayList);
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        return arrayList;
    }

    @Override // fa.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g copy(List list) {
        String str = this.f6085a;
        List list2 = this.f6086b;
        List listC = c(this.f6066e, 0, list);
        List list3 = Collections.EMPTY_LIST;
        return new g(str, list2, listC, list3, c(this.f6068g, 1, list), c(this.f6069h, 2, list), list3, this.f6071j, this.f6072k, this.f6087c, this.f6073l, this.f6074m);
    }
}
