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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0011\u0010\u0019\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/applovin/shadow/okio/HashingSource;", "Lcom/applovin/shadow/okio/ForwardingSource;", "Lcom/applovin/shadow/okio/Source;", "source", "Ljava/security/MessageDigest;", "digest", "<init>", "(Lvh/l0;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lvh/l0;Ljava/lang/String;)V", "Ljavax/crypto/Mac;", "mac", "(Lvh/l0;Ljavax/crypto/Mac;)V", "Lcom/applovin/shadow/okio/ByteString;", C4240b4.i.W, "(Lvh/l0;Lvh/h;Ljava/lang/String;)V", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "-deprecated_hash", "()Lcom/applovin/shadow/okio/ByteString;", "hash", "messageDigest", "Ljava/security/MessageDigest;", "Ljavax/crypto/Mac;", "()Lvh/h;", com.taurusx.tax.f.y.f66058y, "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HashingSource extends ForwardingSource implements Source {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Mac mac;

    @Nullable
    private final MessageDigest messageDigest;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/applovin/shadow/okio/HashingSource$Companion;", "", "()V", "hmacSha1", "Lcom/applovin/shadow/okio/HashingSource;", "source", "Lcom/applovin/shadow/okio/Source;", C4240b4.i.W, "Lcom/applovin/shadow/okio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA1");
        }

        @NotNull
        public final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA256");
        }

        @NotNull
        public final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString key) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            return new HashingSource(source, key, "HmacSHA512");
        }

        @NotNull
        public final HashingSource md5(@NotNull Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, "MD5");
        }

        @NotNull
        public final HashingSource sha1(@NotNull Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        @NotNull
        public final HashingSource sha256(@NotNull Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        @NotNull
        public final HashingSource sha512(@NotNull Source source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new HashingSource(source, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull MessageDigest digest) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(digest, "digest");
        this.messageDigest = digest;
        this.mac = null;
    }

    @NotNull
    public static final HashingSource hmacSha1(@NotNull Source source, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha1(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha256(@NotNull Source source, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha256(source, byteString);
    }

    @NotNull
    public static final HashingSource hmacSha512(@NotNull Source source, @NotNull ByteString byteString) {
        return INSTANCE.hmacSha512(source, byteString);
    }

    @NotNull
    public static final HashingSource md5(@NotNull Source source) {
        return INSTANCE.md5(source);
    }

    @NotNull
    public static final HashingSource sha1(@NotNull Source source) {
        return INSTANCE.sha1(source);
    }

    @NotNull
    public static final HashingSource sha256(@NotNull Source source) {
        return INSTANCE.sha256(source);
    }

    @NotNull
    public static final HashingSource sha512(@NotNull Source source) {
        return INSTANCE.sha512(source);
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_hash, reason: not valid java name */
    public final ByteString m4422deprecated_hash() {
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

    @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = super.read(sink, byteCount);
        if (j10 != -1) {
            long size = sink.size() - j10;
            long size2 = sink.size();
            Segment segment = sink.head;
            Intrinsics.checkNotNull(segment);
            while (size2 > size) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size2 -= (long) (segment.limit - segment.pos);
            }
            while (size2 < sink.size()) {
                int i10 = (int) ((((long) segment.pos) + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i10, segment.limit - i10);
                } else {
                    Mac mac = this.mac;
                    Intrinsics.checkNotNull(mac);
                    mac.update(segment.data, i10, segment.limit - i10);
                }
                size2 += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size = size2;
            }
        }
        return j10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(@NotNull Source source, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(@NotNull Source source, @NotNull Mac mac) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(@NotNull Source source, @NotNull ByteString key, @NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            Unit unit = Unit.f93236a;
            Intrinsics.checkNotNull(mac);
            this(source, mac);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
