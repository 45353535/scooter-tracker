package com.mobilefuse.sdk.crypto;

import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"encryptAes", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "", "", C4240b4.i.W, "iv", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class Aes_encryptionKt {
    @NotNull
    public static final Either<BaseError, byte[]> encryptAes(@NotNull String encryptAes, @NotNull String key, @NotNull String iv) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(encryptAes, "$this$encryptAes");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iv, "iv");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            Charset charset = Charsets.UTF_8;
            byte[] bytes = key.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            byte[] bytes2 = iv.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bytes2));
            byte[] bytes3 = encryptAes.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
            errorResult = new SuccessResult(new SuccessResult(cipher.doFinal(bytes3)));
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Either) value;
    }
}
