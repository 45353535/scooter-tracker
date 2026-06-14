package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends kotlin.random.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f93340d = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.random.a
    public Random o() {
        Object obj = this.f93340d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
