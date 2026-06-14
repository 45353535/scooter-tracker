package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* JADX INFO: loaded from: classes11.dex */
public abstract class POBVastCreative implements POBXMLNodeListener {

    @Nullable
    protected String mClickThroughURL;

    @Nullable
    protected List<String> mClickTrackers;

    public enum CreativeType {
        LINEAR,
        NONLINEAR,
        COMPANION
    }

    public enum POBEventTypes {
        CREATIVE_VIEW("creativeview"),
        START("start"),
        FIRST_QUARTILE("firstquartile"),
        MID_POINT("midpoint"),
        THIRD_QUARTILE("thirdQuartile"),
        COMPLETE("complete"),
        MUTE("mute"),
        UNMUTE("unmute"),
        PAUSE("pause"),
        REWIND(EventConstants.REWIND),
        RESUME("resume"),
        FULL_SCREEN("fullscreen"),
        EXIT_FULL_SCREEN("exitFullscreen"),
        EXPAND("expand"),
        COLLAPSE("collapse"),
        ACCEPT_INVITATION_LINEAR("acceptInvitationLinear"),
        CLOSE_LINEAR("closeLinear"),
        SKIP("skip"),
        PROGRESS("progress"),
        AD_EXPAND(EventConstants.AD_EXPAND),
        AD_COLLAPSE(EventConstants.AD_COLLAPSE),
        MINIMIZE(EventConstants.MINIMIZE),
        OVERLAY_VIEW_DURATION(EventConstants.OVERLAY_VIEW_DURATION),
        CLOSE("close"),
        OTHER_AD_INTERACTION(EventConstants.OTHER_AD_INTERACTION),
        LOADED(C4240b4.i.f42648r),
        PLAYER_EXPAND(EventConstants.PLAYER_EXPAND),
        PLAYER_COLLAPSE(EventConstants.PLAYER_COLLAPSE),
        NOT_USED(EventConstants.NOT_USED);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f63268b;

        POBEventTypes(String str) {
            this.f63268b = str;
        }

        public String getValue() {
            return this.f63268b;
        }
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public abstract /* synthetic */ void build(@NonNull POBNodeBuilder pOBNodeBuilder);

    @Nullable
    public String getClickThroughURL() {
        return this.mClickThroughURL;
    }

    @Nullable
    public List<String> getClickTrackers() {
        return this.mClickTrackers;
    }

    @NonNull
    public List<String> getTrackingEventUrls(@NonNull POBEventTypes pOBEventTypes) {
        ArrayList arrayList = new ArrayList();
        List<POBTracking> trackingEvents = getTrackingEvents(pOBEventTypes);
        if (trackingEvents != null) {
            Iterator<POBTracking> it = trackingEvents.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUrl());
            }
        }
        return arrayList;
    }

    abstract List getTrackingEvents();

    @Nullable
    public List<POBTracking> getTrackingEvents(@NonNull POBEventTypes pOBEventTypes) {
        ArrayList arrayList = new ArrayList();
        List<POBTracking> trackingEvents = getTrackingEvents();
        if (trackingEvents != null) {
            for (POBTracking pOBTracking : trackingEvents) {
                if (pOBTracking.getEvent() != null && pOBTracking.getEvent().equalsIgnoreCase(pOBEventTypes.getValue())) {
                    arrayList.add(pOBTracking);
                }
            }
        }
        return arrayList;
    }

    public abstract CreativeType getVastCreativeType();
}
