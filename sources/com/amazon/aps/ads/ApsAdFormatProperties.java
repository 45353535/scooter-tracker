package com.amazon.aps.ads;

import com.amazon.aps.ads.model.ApsSlotInfoExtra;
import com.amazon.device.ads.DtbConstants;

/* JADX INFO: loaded from: classes5.dex */
public class ApsAdFormatProperties {
    private static final String LOGTAG = "ApsAdFormatProperties";
    private int playerHeight;
    private int playerWidth;
    private ApsSlotInfoExtra slotInfoExtra;

    public static class Builder {
        private int playerHeight;
        private int playerWidth;
        private ApsSlotInfoExtra slotInfoExtra;

        public ApsAdFormatProperties build() {
            return new ApsAdFormatProperties(this);
        }

        public Builder setPlayerHeight(int i10) {
            this.playerHeight = i10;
            return this;
        }

        public Builder setPlayerWidth(int i10) {
            this.playerWidth = i10;
            return this;
        }

        public Builder setSlotInfoExtra(ApsSlotInfoExtra apsSlotInfoExtra) {
            this.slotInfoExtra = apsSlotInfoExtra;
            return this;
        }
    }

    public int getPlayerHeight() {
        int i10 = this.playerHeight;
        return i10 == 0 ? DtbConstants.DEFAULT_PLAYER_HEIGHT : i10;
    }

    public int getPlayerWidth() {
        int i10 = this.playerWidth;
        if (i10 == 0) {
            return 320;
        }
        return i10;
    }

    public ApsSlotInfoExtra getSlotInfoExtra() {
        return this.slotInfoExtra;
    }

    private ApsAdFormatProperties(Builder builder) {
        this.playerHeight = builder.playerHeight;
        this.playerWidth = builder.playerWidth;
        this.slotInfoExtra = builder.slotInfoExtra;
    }
}
