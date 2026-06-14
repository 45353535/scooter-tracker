package org.bidon.dtexchange.ext;

import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final BidonError.Unspecified a(InneractiveUnitController.AdDisplayError adDisplayError) {
        return new BidonError.Unspecified(org.bidon.dtexchange.a.a(), adDisplayError, null, 4, null);
    }
}
