package ve;

import com.ironsource.C4240b4;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f106688c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f106690b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(String content, List parameters) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f106689a = content;
        this.f106690b = parameters;
    }

    protected final String a() {
        return this.f106689a;
    }

    public final List b() {
        return this.f106690b;
    }

    public final String c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int lastIndex = CollectionsKt.getLastIndex(this.f106690b);
        if (lastIndex < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            l lVar = (l) this.f106690b.get(i10);
            if (StringsKt.N(lVar.c(), name, true)) {
                return lVar.d();
            }
            if (i10 == lastIndex) {
                return null;
            }
            i10++;
        }
    }

    public String toString() {
        if (this.f106690b.isEmpty()) {
            return this.f106689a;
        }
        int length = this.f106689a.length();
        int i10 = 0;
        int length2 = 0;
        for (l lVar : this.f106690b) {
            length2 += lVar.c().length() + lVar.d().length() + 3;
        }
        StringBuilder sb2 = new StringBuilder(length + length2);
        sb2.append(this.f106689a);
        int lastIndex = CollectionsKt.getLastIndex(this.f106690b);
        if (lastIndex >= 0) {
            while (true) {
                l lVar2 = (l) this.f106690b.get(i10);
                sb2.append("; ");
                sb2.append(lVar2.c());
                sb2.append(C4240b4.j.f42668b);
                String strD = lVar2.d();
                if (n.c(strD)) {
                    sb2.append(n.d(strD));
                } else {
                    sb2.append(strD);
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }
}
