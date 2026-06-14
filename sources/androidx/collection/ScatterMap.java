package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001c\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001aJ-\u0010!\u001a\u00020\u00062\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"J-\u0010\u0007\u001a\u00020\u00062\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\"J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J-\u0010#\u001a\u00020\u00162\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010%J\u0018\u0010&\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b(\u0010'J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00028\u0001¢\u0006\u0004\b*\u0010'J_\u00103\u001a\u0002022\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0002\u0010/\u001a\u00020\u00162\b\b\u0002\u00100\u001a\u00020+2\u001c\b\u0002\u00101\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020+\u0018\u00010\u001bH\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0016H\u0016¢\u0006\u0004\b5\u0010$J\u001a\u00107\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b7\u0010'J\u000f\u00108\u001a\u000202H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u000202H\u0000¢\u0006\u0004\b:\u00109J\u0018\u0010>\u001a\u00020\u00162\u0006\u0010\f\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?¢\u0006\u0004\b@\u0010AR\u001c\u0010C\u001a\u00020B8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u0010\u0005R$\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030F8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010\u0005R$\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030F8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010H\u0012\u0004\bK\u0010\u0005R\u0016\u0010L\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0011\u0010P\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bO\u0010$R\u0011\u0010R\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bQ\u0010$\u0082\u0001\u0001S\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006T"}, d2 = {"Landroidx/collection/ScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "<init>", "()V", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", C4240b4.i.W, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "", "block", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "forEachKey", "forEachValue", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function2;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "value", "containsValue", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "asDebugString$collection", "asDebugString", "findKeyIndex$collection", "(Ljava/lang/Object;)I", "findKeyIndex", "", "asMap", "()Ljava/util/Map;", "", "metadata", "[J", "getMetadata$annotations", "", UserMetadata.KEYDATA_FILENAME, "[Ljava/lang/Object;", "getKeys$annotations", "values", "getValues$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ScatterMap<K, V> {
    public int _capacity;
    public int _size;

    @NotNull
    public Object[] keys;

    @NotNull
    public long[] metadata;

    @NotNull
    public Object[] values;

    public /* synthetic */ ScatterMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ScatterMap scatterMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function2 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        if ((i11 & 32) != 0) {
            function2 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function2 function22 = function2;
        return scatterMap.joinToString(charSequence, charSequence2, charSequence3, i10, charSequence5, function22);
    }

    public final boolean all(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(objArr[i13], objArr2[i13]).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    @NotNull
    public final String asDebugString$collection() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        sb2.append("metadata=[");
        int i10 = get_capacity();
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = (this.metadata[i11 >> 3] >> ((i11 & 7) << 3)) & 255;
            if (j10 == 128) {
                sb2.append("Empty");
            } else if (j10 == 254) {
                sb2.append("Deleted");
            } else {
                sb2.append(j10);
            }
            sb2.append(", ");
        }
        sb2.append("], ");
        sb2.append("keys=[");
        int length = this.keys.length;
        for (int i12 = 0; i12 < length; i12++) {
            sb2.append(this.keys[i12]);
            sb2.append(", ");
        }
        sb2.append("], ");
        sb2.append("values=[");
        int length2 = this.values.length;
        for (int i13 = 0; i13 < length2; i13++) {
            sb2.append(this.values[i13]);
            sb2.append(", ");
        }
        sb2.append(C4240b4.j.f42674e);
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final Map<K, V> asMap() {
        return new MapWrapper(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(K r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.contains(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(K r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.keys
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(V r15) {
        /*
            r14 = this;
            java.lang.Object[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L48
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L43
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L41
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r10)
            if (r10 == 0) goto L3d
            r15 = 1
            return r15
        L3d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L41:
            if (r7 != r8) goto L48
        L43:
            if (r4 == r2) goto L48
            int r4 = r4 + 1
            goto Lb
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.containsValue(java.lang.Object):boolean");
    }

    public final int count() {
        return get_size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.ScatterMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            int r3 = r1.get_size()
            int r5 = r0.get_size()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.keys
            java.lang.Object[] r5 = r0.values
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L78
            r8 = r4
        L27:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L73
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L41:
            if (r13 >= r11) goto L71
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L62
            java.lang.Object r14 = r1.get(r15)
            if (r14 != 0) goto L61
            boolean r14 = r1.containsKey(r15)
            if (r14 != 0) goto L6d
        L61:
            return r4
        L62:
            java.lang.Object r15 = r1.get(r15)
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r15)
            if (r14 != 0) goto L6d
            return r4
        L6d:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L41
        L71:
            if (r11 != r12) goto L78
        L73:
            if (r8 == r7) goto L78
            int r8 = r8 + 1
            goto L27
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.equals(java.lang.Object):boolean");
    }

    public final int findKeyIndex$collection(K key) {
        int i10 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.metadata;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final void forEach(@NotNull Function2<? super K, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        block.invoke(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachIndexed(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachKey(@NotNull Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachValue(@NotNull Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(K r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.keys
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.values
            r14 = r14[r10]
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.get(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(K r14, V r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.keys
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L74
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object[] r14 = r13.values
            r14 = r14[r10]
            return r14
        L73:
            return r15
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(K key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v10 = get(key);
        return v10 == null ? defaultValue.invoke() : v10;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[PHI: r8
  0x007b: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0032, B:25:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            java.lang.String r1 = "{}"
            return r1
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.lang.Object[] r2 = r0.keys
            java.lang.Object[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L80
            r6 = 0
            r7 = r6
            r8 = r7
        L24:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L7b
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3e:
            if (r13 >= r11) goto L79
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L75
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            java.lang.String r16 = "(this)"
            if (r15 != r0) goto L56
            r15 = r16
        L56:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L62
            r14 = r16
        L62:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0._size
            if (r8 >= r14) goto L75
            r14 = 44
            r1.append(r14)
            r14 = 32
            r1.append(r14)
        L75:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3e
        L79:
            if (r11 != r12) goto L80
        L7b:
            if (r7 == r5) goto L80
            int r7 = r7 + 1
            goto L24
        L80:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.toString():java.lang.String");
    }

    private ScatterMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.keys
            java.lang.Object[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5b
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L56
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L54
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L50
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L50
            r1 = 1
            return r1
        L50:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L54:
            if (r10 != r11) goto L5b
        L56:
            if (r7 == r5) goto L5b
            int r7 = r7 + 1
            goto L16
        L5b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(objArr[i14], objArr2[i14]).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function2<? super K, ? super V, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr5 = this.keys;
        Object[] objArr6 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j10 = jArr[i10];
                int i12 = i10;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = objArr5[i15];
                            objArr3 = objArr5;
                            Object obj2 = objArr6[i15];
                            objArr4 = objArr6;
                            if (i11 == limit) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb2.append(separator);
                            }
                            if (transform == null) {
                                sb2.append(obj);
                                sb2.append(D5.T);
                                sb2.append(obj2);
                            } else {
                                sb2.append(transform.invoke(obj, obj2));
                            }
                            i11++;
                        } else {
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                        }
                        j10 >>= 8;
                        i14++;
                        objArr6 = objArr4;
                        objArr5 = objArr3;
                    }
                    objArr = objArr5;
                    objArr2 = objArr6;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr5;
                    objArr2 = objArr6;
                }
                if (i12 == length) {
                    break;
                }
                i10 = i12 + 1;
                objArr6 = objArr2;
                objArr5 = objArr;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
