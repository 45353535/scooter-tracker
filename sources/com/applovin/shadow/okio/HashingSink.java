package com.applovin.shadow.okio;

import com.ironsource.C4240b4;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0011\u0010\u001a\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Lcom/applovin/shadow/okio/HashingSink;", "Lcom/applovin/shadow/okio/ForwardingSink;", "Lcom/applovin/shadow/okio/Sink;", "sink", "Ljava/security/MessageDigest;", "digest", "<init>", "(Lvh/j0;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lvh/j0;Ljava/lang/String;)V", "Ljavax/crypto/Mac;", "mac", "(Lvh/j0;Ljavax/crypto/Mac;)V", "Lcom/applovin/shadow/okio/ByteString;", C4240b4.i.W, "(Lvh/j0;Lvh/h;Ljava/lang/String;)V", "Lcom/applovin/shadow/okio/Buffer;", "source", "", "byteCount", "", "write", "(Lcom/applovin/shadow/okio/Buffer;J)V", "-deprecated_hash", "()Lcom/applovin/shadow/okio/ByteString;", "hash", "messageDigest", "Ljava/security/MessageDigest;", "Ljavax/crypto/Mac;", "()Lvh/h;", com.taurusx.tax.f.y.f66058y, "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HashingSink extends ForwardingSink implements Sink {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Mac mac;

    @Nullable
    private final MessageDigest messageDigest;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/applovin/shadow/okio/HashingSink$Companion;", "", "()V", "hmacSha1", "Lcom/applovin/shadow/okio/HashingSink;", "sink", "Lcom/applovin/shadow/okio/Sink;", C4240b4.i.W, "Lcom/applovin/shadow/okio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA1");
        }

        @NotNull
        public final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        @NotNull
        public final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString key) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        @NotNull
        public final HashingSink md5(@NotNull Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        @NotNull
        public final HashingSink sha1(@NotNull Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        @NotNull
        public final HashingSink sha256(@NotNull Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        @NotNull
        public final HashingSink sha512(@NotNull Sink sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull MessageDigest digest) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    @NotNull
    public static final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha1(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha256(sink, byteString);
    }

    @NotNull
    public static final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha512(sink, byteString);
    }

    @NotNull
    public static final HashingSink md5(@NotNull Sink sink) {
        return INSTANCE.md5(sink);
    }

    @NotNull
    public static final HashingSink sha1(@NotNull Sink sink) {
        return INSTANCE.sha1(sink);
    }

    @NotNull
    public static final HashingSink sha256(@NotNull Sink sink) {
        return INSTANCE.sha256(sink);
    }

    @NotNull
    public static final HashingSink sha512(@NotNull Sink sink) {
        return INSTANCE.sha512(sink);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m4421deprecated_hash() {
        return hash();
    }

    @NotNull
    public final ByteString hash() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            Intrinsics.checkNotNull(mac);
            bArrDoFinal = mac.doFinal();
        }
        Intrinsics.checkNotNull(bArrDoFinal);
        return new ByteString(bArrDoFinal);
    }

    @Override // com.applovin.shadow.okio.ForwardingSink, com.applovin.shadow.okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        Segment segment = source.head;
        Intrinsics.checkNotNull(segment);
        long j10 = 0;
        while (j10 < byteCount) {
            int iMin = (int) Math.min(byteCount - j10, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, iMin);
            } else {
                Mac mac = this.mac;
                Intrinsics.checkNotNull(mac);
                mac.update(segment.data, segment.pos, iMin);
            }
            j10 += (long) iMin;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        }
        super.write(source, byteCount);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(@NotNull Sink sink, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        super(sink);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(@NotNull Sink sink, @NotNull ByteString key, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            Unit unit = Unit.f93236a;
            Intrinsics.checkNotNull(mac);
            this(sink, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
