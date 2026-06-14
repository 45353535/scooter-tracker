package com.applovin.shadow.okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C1700SegmentedByteString;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.SegmentPool;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Utf8;
import com.applovin.shadow.okio._JvmPlatformKt;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.A1;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a,\u0010\u0019\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001b\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u000bH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010!\u001a\u00020 *\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010#\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b%\u0010\u001c\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u000b2\u0006\u0010&\u001a\u00020\fH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010*\u001a\u00020)*\u00020\u000bH\u0080\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010,\u001a\u00020)*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b,\u0010-\u001a0\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00103\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\b5\u00104\u001a\u001c\u00107\u001a\u00020\u0000*\u00020\u000b2\u0006\u00106\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b7\u00108\u001a\u001c\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b0\u0010:\u001a,\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b0\u0010;\u001a\u0014\u0010<\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010<\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b<\u0010>\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010B\u001a\u00020)*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bB\u0010C\u001a,\u0010@\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b@\u0010D\u001a\u0014\u0010E\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bE\u0010\u001c\u001a\u0014\u0010F\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bF\u0010\u001c\u001a\u0014\u0010G\u001a\u00020.*\u00020\u000bH\u0080\b¢\u0006\u0004\bG\u0010H\u001a\u001c\u0010G\u001a\u00020.*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bG\u0010I\u001a\u001c\u0010J\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b¢\u0006\u0004\bJ\u0010K\u001a$\u0010B\u001a\u00020)*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bB\u0010L\u001a\u001c\u0010N\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020MH\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u001c\u0010P\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bP\u0010\u0010\u001a\u0016\u0010Q\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010T\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010S\u001a\u00020\fH\u0080\b¢\u0006\u0004\bT\u0010\u0010\u001a\u0014\u0010U\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\bU\u0010$\u001a,\u0010Y\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010\\\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010[\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\\\u0010]\u001a\u001c\u0010_\u001a\u00020\f*\u00020\u000b2\u0006\u00109\u001a\u00020^H\u0080\b¢\u0006\u0004\b_\u0010`\u001a$\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020^2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b0\u0010a\u001a\u001c\u0010c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010b\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bc\u0010]\u001a\u001c\u0010e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010d\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\be\u0010]\u001a\u001c\u0010g\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010f\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bg\u0010]\u001a\u001c\u0010h\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\bh\u00104\u001a$\u00100\u001a\u00020)*\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b0\u0010L\u001a$\u0010@\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b@\u0010i\u001a,\u0010l\u001a\u00020\f*\u00020\u000b2\u0006\u0010b\u001a\u00020\u001d2\u0006\u0010j\u001a\u00020\f2\u0006\u0010k\u001a\u00020\fH\u0080\b¢\u0006\u0004\bl\u0010m\u001a$\u0010l\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010j\u001a\u00020\fH\u0080\b¢\u0006\u0004\bl\u0010n\u001a$\u0010p\u001a\u00020\f*\u00020\u000b2\u0006\u0010o\u001a\u00020.2\u0006\u0010j\u001a\u00020\fH\u0080\b¢\u0006\u0004\bp\u0010n\u001a4\u0010q\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bq\u0010r\u001a\u001e\u0010u\u001a\u00020\b*\u00020\u000b2\b\u0010t\u001a\u0004\u0018\u00010sH\u0080\b¢\u0006\u0004\bu\u0010v\u001a\u0014\u0010w\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\bw\u0010$\u001a\u0014\u0010x\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0004\bx\u0010y\u001a\u0014\u0010z\u001a\u00020.*\u00020\u000bH\u0080\b¢\u0006\u0004\bz\u0010H\u001a\u001c\u0010z\u001a\u00020.*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bz\u0010{\u001a\u001b\u0010~\u001a\u00020|*\u00020\u000b2\u0006\u0010}\u001a\u00020|H\u0000¢\u0006\u0004\b~\u0010\u007f\u001a\u001d\u0010\u0080\u0001\u001a\u00020|*\u00020\u000b2\u0006\u0010}\u001a\u00020|H\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u007f\u001a\u0017\u0010\u0081\u0001\u001a\u00020\u0002*\u00020|H\u0080\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u001f\u0010\u0083\u0001\u001a\u00020\u0002*\u00020|2\u0006\u0010\u0017\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a \u0010\u0086\u0001\u001a\u00020\f*\u00020|2\u0007\u0010\u0085\u0001\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a \u0010\u0089\u0001\u001a\u00020\f*\u00020|2\u0007\u0010\u0088\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0017\u0010\u008b\u0001\u001a\u00020)*\u00020|H\u0080\b¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001aG\u0010\u0090\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u008d\u0001*\u00020\u000b2\u0006\u0010j\u001a\u00020\f2\u001c\u0010\u008f\u0001\u001a\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u008e\u0001H\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\"'\u0010\u0092\u0001\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u0012\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020\u00028\u0000X\u0080T¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0017\u0010\u009a\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0017\u0010\u009c\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/applovin/shadow/okio/Segment;", A1.f40174i, "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "(Lcom/applovin/shadow/okio/Segment;I[BII)Z", "Lcom/applovin/shadow/okio/Buffer;", "", "newline", "", "readUtf8Line", "(Lcom/applovin/shadow/okio/Buffer;J)Ljava/lang/String;", "Lcom/applovin/shadow/okio/Options;", "options", "selectTruncated", "selectPrefix", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Options;Z)I", "out", "offset", "byteCount", "commonCopyTo", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;JJ)Lcom/applovin/shadow/okio/Buffer;", "commonCompleteSegmentByteCount", "(Lcom/applovin/shadow/okio/Buffer;)J", "", "commonReadByte", "(Lcom/applovin/shadow/okio/Buffer;)B", "", "commonReadShort", "(Lcom/applovin/shadow/okio/Buffer;)S", "commonReadInt", "(Lcom/applovin/shadow/okio/Buffer;)I", "commonReadLong", POBCTAOverlayData.KEY_CTA_POS, "commonGet", "(Lcom/applovin/shadow/okio/Buffer;J)B", "", "commonClear", "(Lcom/applovin/shadow/okio/Buffer;)V", "commonSkip", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/ByteString;", "byteString", "commonWrite", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/Buffer;", "v", "commonWriteDecimalLong", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/Buffer;", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/Segment;", "source", "(Lcom/applovin/shadow/okio/Buffer;[B)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Buffer;[BII)Lcom/applovin/shadow/okio/Buffer;", "commonReadByteArray", "(Lcom/applovin/shadow/okio/Buffer;)[B", "(Lcom/applovin/shadow/okio/Buffer;J)[B", "sink", "commonRead", "(Lcom/applovin/shadow/okio/Buffer;[B)I", "commonReadFully", "(Lcom/applovin/shadow/okio/Buffer;[B)V", "(Lcom/applovin/shadow/okio/Buffer;[BII)I", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "(Lcom/applovin/shadow/okio/Buffer;)Lcom/applovin/shadow/okio/ByteString;", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/ByteString;", "commonSelect", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Options;)I", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "commonReadAll", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Sink;)J", "commonReadUtf8", "commonReadUtf8Line", "(Lcom/applovin/shadow/okio/Buffer;)Ljava/lang/String;", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", TypedValues.Custom.S_STRING, "beginIndex", "endIndex", "commonWriteUtf8", "(Lcom/applovin/shadow/okio/Buffer;Ljava/lang/String;II)Lcom/applovin/shadow/okio/Buffer;", "codePoint", "commonWriteUtf8CodePoint", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/Source;", "commonWriteAll", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/Buffer;", "b", "commonWriteByte", "s", "commonWriteShort", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "commonWriteInt", "commonWriteLong", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;J)J", "fromIndex", "toIndex", "commonIndexOf", "(Lcom/applovin/shadow/okio/Buffer;BJJ)J", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "(Lcom/applovin/shadow/okio/Buffer;JLcom/applovin/shadow/okio/ByteString;II)Z", "", "other", "commonEquals", "(Lcom/applovin/shadow/okio/Buffer;Ljava/lang/Object;)Z", "commonHashCode", "commonCopy", "(Lcom/applovin/shadow/okio/Buffer;)Lcom/applovin/shadow/okio/Buffer;", "commonSnapshot", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadUnsafe", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "commonReadAndWriteUnsafe", "commonNext", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)I", "commonSeek", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;J)I", "newSize", "commonResizeBuffer", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;J)J", "minByteCount", "commonExpandBuffer", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;I)J", "commonClose", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)V", "T", "Lkotlin/Function2;", "lambda", "seek", "(Lvh/e;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "SEGMENTING_THRESHOLD", "I", "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Buffer {

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        int i10 = segment2.limit;
        return (i10 >= 8192 || !segment2.owner) ? size : size - ((long) (i10 - segment2.pos));
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonCopy(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonCopyTo(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j12, j11);
        if (j11 != 0) {
            out.setSize$okio(out.size() + j11);
            Segment segment = buffer.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j13 = j11;
            while (j13 > 0) {
                Intrinsics.checkNotNull(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i12 = segmentSharedCopy.pos + ((int) j12);
                segmentSharedCopy.pos = i12;
                segmentSharedCopy.limit = Math.min(i12 + ((int) j13), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    Intrinsics.checkNotNull(segment3);
                    Segment segment4 = segment3.prev;
                    Intrinsics.checkNotNull(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j13 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment2 = segment2.next;
                j12 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull com.applovin.shadow.okio.Buffer buffer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.shadow.okio.Buffer)) {
            return false;
        }
        com.applovin.shadow.okio.Buffer buffer2 = (com.applovin.shadow.okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i10 = segment.pos;
        int i11 = segment2.pos;
        long j10 = 0;
        while (j10 < buffer.size()) {
            long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (segment.data[i10] != segment2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i10 = segment.pos;
            }
            if (i11 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i11 = segment2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, int i10) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i10 <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i10).toString());
        }
        if (i10 > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i10).toString());
        }
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        int i11 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j10 = i11;
        buffer.setSize$okio(size + j10);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i11;
        unsafeCursor.end = 8192;
        return j10;
    }

    public static final byte commonGet(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j10, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (buffer.size() - j10 < j10) {
            long size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + j10) - j11)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j11 = j12;
        }
    }

    public static final int commonHashCode(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i10;
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.Buffer buffer, byte b10, long j10, long j11) {
        Segment segment;
        int i10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > buffer.size()) {
            j11 = buffer.size();
        }
        if (j10 == j11 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j10 < j10) {
            size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j11) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
                i10 = (int) ((((long) segment.pos) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + size;
            if (j12 > j10) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
            i10 = (int) ((((long) segment.pos) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - segment.pos)) + size;
    }

    public static final long commonIndexOfElement(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull ByteString targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j10 < j10) {
            size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i12 = segment.limit;
                    while (i10 < i12) {
                        byte b12 = bArr[i10];
                        if (b12 == b10 || b12 == b11) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j10 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i13 = segment.limit;
                    while (i10 < i13) {
                        byte b13 = bArr2[i10];
                        for (byte b14 : bArrInternalArray$okio) {
                            if (b13 == b14) {
                                i11 = segment.pos;
                            }
                        }
                        i10++;
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + size;
            if (j11 > j10) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte b15 = targetBytes.getByte(0);
            byte b16 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i14 = segment.limit;
                while (i10 < i14) {
                    byte b17 = bArr3[i10];
                    if (b17 == b15 || b17 == b16) {
                        i11 = segment.pos;
                    } else {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j10 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i15 = segment.limit;
                while (i10 < i15) {
                    byte b18 = bArr4[i10];
                    for (byte b19 : bArrInternalArray$okio2) {
                        if (b18 == b19) {
                            i11 = segment.pos;
                        }
                    }
                    i10++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j10 = size;
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public static final int commonNext(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j10 = unsafeCursor.offset;
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j10 == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j11 = unsafeCursor.offset;
        return unsafeCursor.seek(j11 == -1 ? 0L : j11 + ((long) (unsafeCursor.end - unsafeCursor.start)));
    }

    public static final boolean commonRangeEquals(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10, @NotNull ByteString bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || buffer.size() - j10 < i11 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (buffer.getByte(((long) i12) + j10) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        int i12 = i10 + 1;
        byte b10 = segment.data[i10];
        buffer.setSize$okio(buffer.size() - 1);
        if (i12 != i11) {
            segment.pos = i12;
            return b10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = new com.applovin.shadow.okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.readUtf8());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r19) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.commonReadDecimalLong(com.applovin.shadow.okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = buffer.read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[EDGE_INSN: B:43:0x00ac->B:37:0x00ac BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb6
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            com.applovin.shadow.okio.Segment r6 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L98
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L79
            r11 = 70
            if (r10 > r11) goto L79
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            com.applovin.shadow.okio.Buffer r14 = new com.applovin.shadow.okio.Buffer
            r14.<init>()
            com.applovin.shadow.okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L79:
            if (r0 == 0) goto L7d
            r1 = 1
            goto L98
        L7d:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = com.applovin.shadow.okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L98:
            if (r8 != r9) goto La4
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto La6
        La4:
            r6.pos = r8
        La6:
            if (r1 != 0) goto Lac
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        Lac:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb6:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        buffer.setSize$okio(buffer.size() - 4);
        if (i14 != i11) {
            segment.pos = i14;
            return i15;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i15;
    }

    public static final long commonReadLong(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 8) {
            return ((((long) buffer.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) buffer.readInt()));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i13 != i11) {
            segment.pos = i13;
            return j11;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j11;
    }

    public static final short commonReadShort(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        buffer.setSize$okio(buffer.size() - 2);
        if (i14 == i11) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return (short) i15;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadUnsafe(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        if (((long) i10) + j10 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j10), 0, 0, 3, null);
        }
        int i11 = (int) j10;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i10, i10 + i11);
        segment.pos += i11;
        buffer.setSize$okio(buffer.size() - j10);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b10 = buffer.getByte(0L);
        if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i10 = b10 & Ascii.DEL;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & Ascii.US;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & 240) == 224) {
            i10 = b10 & Ascii.SI;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (buffer.size() < j10) {
            throw new EOFException("size < " + i11 + ": " + buffer.size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b10) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = buffer.getByte(j11);
            if ((b11 & 192) != 128) {
                buffer.skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j10);
        return i10 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j11 < buffer.size() && buffer.getByte(j11 - 1) == 13 && buffer.getByte(j11) == 10) {
            return readUtf8Line(buffer, j11);
        }
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j10) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, long j10) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j10 <= size) {
            if (j10 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
            }
            long j11 = size - j10;
            while (true) {
                if (j11 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                int i10 = segment2.limit;
                long j12 = i10 - segment2.pos;
                if (j12 > j11) {
                    segment2.limit = i10 - ((int) j11);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j11 -= j12;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j10;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j10 > size) {
            long j13 = j10 - size;
            boolean z10 = true;
            while (j13 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j13, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j13 -= (long) iMin;
                if (z10) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i11 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i11 - iMin;
                    unsafeCursor.end = i11;
                    z10 = false;
                }
            }
        }
        buffer.setSize$okio(j10);
        return size;
    }

    public static final int commonSeek(@NotNull Buffer.UnsafeCursor unsafeCursor, long j10) {
        Segment segmentPush;
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j10 < -1 || j10 > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + buffer.size());
        }
        if (j10 == -1 || j10 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j10;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j11 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j12 = unsafeCursor.offset;
            int i10 = unsafeCursor.start;
            Segment segment2 = unsafeCursor.getSegment();
            Intrinsics.checkNotNull(segment2);
            long j13 = j12 - ((long) (i10 - segment2.pos));
            if (j13 > j10) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j13;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j11 = j13;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j10 > j10 - j11) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                int i11 = segmentPush.limit;
                int i12 = segmentPush.pos;
                if (j10 < ((long) (i11 - i12)) + j11) {
                    break;
                }
                j11 += (long) (i11 - i12);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j10) {
                Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            j11 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment3 = segmentPush.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j10;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i13 = segmentPush.pos + ((int) (j10 - j11));
        unsafeCursor.start = i13;
        int i14 = segmentPush.limit;
        unsafeCursor.end = i14;
        return i14 - i13;
    }

    public static final int commonSelect(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j10 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            long j11 = iMin;
            buffer.setSize$okio(buffer.size() - j11);
            j10 -= j11;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() <= SieveCacheKt.NodeLinkMask) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull com.applovin.shadow.okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i10 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull ByteString byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i10, i11);
        return buffer;
    }

    public static /* synthetic */ com.applovin.shadow.okio.Buffer commonWrite$default(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i10, i11);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteByte(@NotNull com.applovin.shadow.okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i11 + 1;
        bArr[i11] = (byte) i10;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteDecimalLong(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 == 0) {
            return buffer.writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 >= 100000000) {
            i10 = j10 < 1000000000000L ? j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
        } else if (j10 >= 10000) {
            i10 = j10 < 1000000 ? j10 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6 : j10 < 10000000 ? 7 : 8;
        } else if (j10 >= 100) {
            i10 = j10 < 1000 ? 3 : 4;
        } else if (j10 >= 10) {
            i10 = 2;
        }
        if (z10) {
            i10++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i10;
        buffer.setSize$okio(buffer.size() + ((long) i10));
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 == 0) {
            return buffer.writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        buffer.setSize$okio(buffer.size() + ((long) i10));
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteInt(@NotNull com.applovin.shadow.okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteLong(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        segmentWritableSegment$okio.limit = i10 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteShort(@NotNull com.applovin.shadow.okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull String string, int i10, int i11) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i12 = segmentWritableSegment$okio.limit - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = segmentWritableSegment$okio.limit;
                int i15 = (i12 + i10) - i14;
                segmentWritableSegment$okio.limit = i14 + i15;
                buffer.setSize$okio(buffer.size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i16 = segmentWritableSegment$okio2.limit;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i16 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i17 = segmentWritableSegment$okio3.limit;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i17 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i20 = segmentWritableSegment$okio4.limit;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i20 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8CodePoint(@NotNull com.applovin.shadow.okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i10 < 128) {
            buffer.writeByte(i10);
            return buffer;
        }
        if (i10 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i11 = segmentWritableSegment$okio.limit;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio.limit = i11 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i10 && i10 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i10 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i12 = segmentWritableSegment$okio2.limit;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio2.limit = i12 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i10));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i13 = segmentWritableSegment$okio3.limit;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        segmentWritableSegment$okio3.limit = i13 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i10, @NotNull byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (buffer.getByte(j11) == 13) {
                String utf8 = buffer.readUtf8(j11);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j10);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10, @NotNull Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j10 < j10) {
            long size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                return lambda.invoke(segment, Long.valueOf(j11));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j11 = j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int selectPrefix(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r17, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Options r18, boolean r19) {
        /*
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.applovin.shadow.okio.Segment r0 = r0.head
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L18
            if (r19 == 0) goto L17
            return r1
        L17:
            return r3
        L18:
            byte[] r4 = r0.data
            int r5 = r0.pos
            int r6 = r0.limit
            int[] r2 = r2.getTrie()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L26:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L31
            r10 = r11
        L31:
            if (r9 != 0) goto L34
            goto L64
        L34:
            r11 = 0
            if (r12 >= 0) goto L7d
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L3b:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L48
            goto L87
        L48:
            if (r14 != r13) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = r7
        L4d:
            if (r12 != r6) goto L6d
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            com.applovin.shadow.okio.Segment r4 = r9.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r6 = r4.pos
            byte[] r8 = r4.data
            int r9 = r4.limit
            if (r4 != r0) goto L67
            if (r5 == 0) goto L64
            r4 = r8
            r8 = r11
            goto L70
        L64:
            if (r19 == 0) goto L87
            return r1
        L67:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L70
        L6d:
            r8 = r9
            r9 = r6
            r6 = r12
        L70:
            if (r5 == 0) goto L78
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La2
        L78:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3b
        L7d:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L85:
            if (r8 != r14) goto L88
        L87:
            return r10
        L88:
            r15 = r2[r8]
            if (r5 != r15) goto La9
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La2
            com.applovin.shadow.okio.Segment r9 = r9.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r4 = r9.pos
            byte[] r6 = r9.data
            int r8 = r9.limit
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La2
            r9 = r11
        La2:
            if (r5 < 0) goto La5
            return r5
        La5:
            int r8 = -r5
            r5 = r13
            goto L26
        La9:
            int r8 = r8 + 1
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.selectPrefix(com.applovin.shadow.okio.Buffer, com.applovin.shadow.okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(com.applovin.shadow.okio.Buffer buffer, Options options, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return selectPrefix(buffer, options, z10);
    }

    public static final int commonRead(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, i11);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i11, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i12 = segment.pos;
        ArraysKt.copyInto(bArr, sink, i10, i12, i12 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        buffer.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        if (j10 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(buffer.readByteArray(j10));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j10);
        buffer.skip(j10);
        return byteStringSnapshot;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - segmentWritableSegment$okio.limit);
            int i13 = i10 + iMin;
            ArraysKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i10, i13);
            segmentWritableSegment$okio.limit += iMin;
            i10 = i13;
        }
        buffer.setSize$okio(buffer.size() + j10);
        return buffer;
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() >= j10) {
            sink.write(buffer, j10);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull com.applovin.shadow.okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i10);
        Segment segment = buffer.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.checkNotNull(segment);
            int i14 = segment.limit;
            int i15 = segment.pos;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        Segment segment2 = buffer.head;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.checkNotNull(segment2);
            bArr[i16] = segment2.data;
            i11 += segment2.limit - segment2.pos;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = segment2.pos;
            segment2.shared = true;
            i16++;
            segment2 = segment2.next;
        }
        return new C1700SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Source source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(buffer, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer sink, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j10 > buffer.size()) {
            j10 = buffer.size();
        }
        sink.write(buffer, j10);
        return j10;
    }

    public static final void commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer source, long j10) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
            while (j10 > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i10 = segment2.limit;
                Intrinsics.checkNotNull(source.head);
                if (j10 < i10 - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        Intrinsics.checkNotNull(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j10) - ((long) (segment.shared ? 0 : segment.pos)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            Segment segment4 = source.head;
                            Intrinsics.checkNotNull(segment4);
                            segment4.writeTo(segment, (int) j10);
                            source.setSize$okio(source.size() - j10);
                            buffer.setSize$okio(buffer.size() + j10);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    Intrinsics.checkNotNull(segment5);
                    source.head = segment5.split((int) j10);
                }
                Segment segment6 = source.head;
                Intrinsics.checkNotNull(segment6);
                long j11 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    Intrinsics.checkNotNull(segment7);
                    Segment segment8 = segment7.prev;
                    Intrinsics.checkNotNull(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j11);
                buffer.setSize$okio(buffer.size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull ByteString bytes, long j10) {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j11 < j11) {
                size = buffer.size();
                while (size > j11) {
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    i10 = (int) ((((long) segment.pos) + j11) - size);
                    while (i10 < iMin) {
                        if (bArr[i10] != b10 || !rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                            i10++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j11 = size;
                }
                return -1L;
            }
            while (true) {
                long j12 = ((long) (segment.limit - segment.pos)) + size;
                if (j12 > j11) {
                    break;
                }
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size = j12;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - ((long) size4)) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j13 = size5;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                i10 = (int) ((((long) segment.pos) + j11) - size);
                while (i10 < iMin2) {
                    if (bArr2[i10] == b11 && rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i10++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size5 = j13;
                j11 = size;
            }
            return -1L;
            return ((long) (i10 - segment.pos)) + size;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
    }
}
