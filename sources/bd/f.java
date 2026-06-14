package bd;

import android.graphics.Bitmap;
import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface f {
    Object a(CoroutineContext coroutineContext, View view, Continuation continuation);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f6265b;

        public a(Object obj, Bitmap bitmap) {
            this.f6264a = obj;
            this.f6265b = bitmap;
        }

        public final Bitmap a() {
            return this.f6265b;
        }

        public final Object b() {
            return this.f6264a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f6264a, aVar.f6264a) && Intrinsics.areEqual(this.f6265b, aVar.f6265b);
        }

        public int hashCode() {
            Object obj = this.f6264a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Bitmap bitmap = this.f6265b;
            return iHashCode + (bitmap != null ? bitmap.hashCode() : 0);
        }

        public String toString() {
            return "CollectResult(result=" + this.f6264a + ", bitmapToRecycle=" + this.f6265b + ')';
        }

        public /* synthetic */ a(Object obj, Bitmap bitmap, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : bitmap);
        }
    }
}
