package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/inmobi/ads/exceptions/InvalidPlacementIdException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InvalidPlacementIdException extends IllegalArgumentException {
    public InvalidPlacementIdException() {
        super("AdPlacement id value is not supplied in XML layout. Banner creation failed.");
    }
}
