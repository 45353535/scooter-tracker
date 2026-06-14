package we;

import com.google.android.material.internal.ViewUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jf.c f107924a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final jf.c f107925b = new a();

    public static final class a extends jf.c {
        a() {
            super(1000);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // jf.c
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public we.b c(we.b instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            instance.f();
            return (we.b) super.c(instance);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // jf.c
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public we.b n() {
            return new we.b();
        }
    }

    public static final class b extends jf.c {
        b() {
            super(1000);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // jf.c
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public int[] c(int[] instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            ArraysKt.fill$default(instance, -1, 0, 0, 6, (Object) null);
            return (int[]) super.c(instance);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // jf.c
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int[] n() {
            int[] iArr = new int[ViewUtils.EDGE_TO_EDGE_FLAGS];
            for (int i10 = 0; i10 < 768; i10++) {
                iArr[i10] = -1;
            }
            return iArr;
        }
    }

    public static final void c(c cVar, String indent, Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        Intrinsics.checkNotNullParameter(out, "out");
        Iterator it = cVar.d().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            out.append(indent);
            out.append(cVar.c(iIntValue));
            out.append(" => ");
            out.append(cVar.i(iIntValue));
            out.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
    }
}
