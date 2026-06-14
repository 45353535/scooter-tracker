package com.startapp.sdk.ads.video.vast;

/* JADX INFO: loaded from: classes11.dex */
public enum VASTErrorCodes {
    ErrorNone(0),
    XMLParsingError(100),
    /* JADX INFO: Fake field, exist only in values array */
    SchemaValidationError(101),
    /* JADX INFO: Fake field, exist only in values array */
    VersionOfResponseNotSupported(102),
    /* JADX INFO: Fake field, exist only in values array */
    TraffickingError(200),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentLinearity(201),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentDuration(202),
    /* JADX INFO: Fake field, exist only in values array */
    VideoPlayerExpectingDifferentSize(203),
    /* JADX INFO: Fake field, exist only in values array */
    AdCategoryRequired(204),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralWrapperError(300),
    WrapperTimeout(301),
    /* JADX INFO: Fake field, exist only in values array */
    WrapperLimitReached(302),
    WrapperNoReponse(303),
    /* JADX INFO: Fake field, exist only in values array */
    InlineResponseTimeout(304),
    GeneralLinearError(400),
    FileNotFound(401),
    TimeoutMediaFileURI(402),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(403),
    MediaFileDisplayError(405),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(406),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(407),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(408),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(409),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(410),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(411),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(500),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(501),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(502),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(503),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(600),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(601),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(602),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(603),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(604),
    UndefinedError(900),
    /* JADX INFO: Fake field, exist only in values array */
    GeneralVPAIDerror(901),
    /* JADX INFO: Fake field, exist only in values array */
    SAShowBeforeVast(10000),
    SAProcessSuccess(20000);

    private int value;

    VASTErrorCodes(int i10) {
        this.value = i10;
    }

    public final int a() {
        return this.value;
    }
}
