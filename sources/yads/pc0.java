package yads;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class pc0 extends Exception {
    public pc0(UUID uuid) {
        super("Media does not support uuid: " + uuid);
    }
}
