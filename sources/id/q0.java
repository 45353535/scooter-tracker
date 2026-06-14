package id;

import android.webkit.MimeTypeMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f74599b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f74600a;

    public static final class a {

        /* JADX INFO: renamed from: id.q0$a$a, reason: collision with other inner class name */
        static final class C0921a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C0921a f74601f = new C0921a();

            C0921a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return pd.f0.n(it);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f74602f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(pd.f0.r(it));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q0 a(String str) {
            q0 q0VarC = c(str);
            if (q0VarC != null || (q0VarC = d(str)) != null) {
                return q0VarC;
            }
            if (str != null) {
                return b(str);
            }
            return null;
        }

        public final q0 b(String str) {
            if (str == null) {
                return null;
            }
            if (StringsKt.y0(str)) {
                str = null;
            }
            if (str != null) {
                return new m(str);
            }
            return null;
        }

        public final q0 c(String str) {
            try {
                String strB = ic.k.f74285a.b(str);
                if (strB != null) {
                    return q0.f74599b.b(strB);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final q0 d(String str) {
            if (str == null) {
                return null;
            }
            return e(CollectionsKt.listOf(str));
        }

        public final q0 e(List input) {
            boolean zE;
            Intrinsics.checkNotNullParameter(input, "input");
            List listC0 = kotlin.sequences.k.c0(kotlin.sequences.k.E(kotlin.sequences.k.R(CollectionsKt.asSequence(input), C0921a.f74601f), b.f74602f));
            Object obj = null;
            if (listC0.isEmpty()) {
                return null;
            }
            Iterator it = listC0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    zE = StringsKt.E(MimeTypeMap.getFileExtensionFromUrl((String) next), "m3u8", true);
                } catch (Throwable unused) {
                    zE = false;
                }
                if (zE) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            return str != null ? new h1(str, b.STREAM) : new h1(listC0, b.PRELOAD);
        }

        private a() {
        }
    }

    public enum b {
        PRELOAD,
        STREAM
    }

    public /* synthetic */ q0(b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    public b a() {
        return this.f74600a;
    }

    private q0(b bVar) {
        this.f74600a = bVar;
    }
}
