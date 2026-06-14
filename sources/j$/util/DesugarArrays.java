package j$.util;

import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.stream.IntStream;
import j$.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static IntStream stream(int[] iArr) {
        return StreamSupport.intStream(Spliterators.spliterator(iArr, 0, iArr.length, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION), false);
    }
}
