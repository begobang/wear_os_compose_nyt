package com.nttdata.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0092\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0006H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013\u00a8\u00064"}, d2 = {"Lcom/nttdata/domain/model/FilmPickBusiness;", "", "display_title", "", "mpaa_rating", "critics_pick", "", "byline", "headline", "summary_short", "publication_date", "opening_date", "date_updated", "link", "Lcom/nttdata/domain/model/FilmPickLinkBusiness;", "multimedia", "Lcom/nttdata/domain/model/FilmPickMultimediaBusiness;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nttdata/domain/model/FilmPickLinkBusiness;Lcom/nttdata/domain/model/FilmPickMultimediaBusiness;)V", "getByline", "()Ljava/lang/String;", "getCritics_pick", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDate_updated", "getDisplay_title", "getHeadline", "getLink", "()Lcom/nttdata/domain/model/FilmPickLinkBusiness;", "getMpaa_rating", "getMultimedia", "()Lcom/nttdata/domain/model/FilmPickMultimediaBusiness;", "getOpening_date", "getPublication_date", "getSummary_short", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nttdata/domain/model/FilmPickLinkBusiness;Lcom/nttdata/domain/model/FilmPickMultimediaBusiness;)Lcom/nttdata/domain/model/FilmPickBusiness;", "equals", "", "other", "hashCode", "toString", "domain_debug"})
public final class FilmPickBusiness {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String display_title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mpaa_rating = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer critics_pick = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String headline = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String summary_short = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String publication_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String opening_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String date_updated = null;
    @org.jetbrains.annotations.Nullable()
    private final com.nttdata.domain.model.FilmPickLinkBusiness link = null;
    @org.jetbrains.annotations.Nullable()
    private final com.nttdata.domain.model.FilmPickMultimediaBusiness multimedia = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.domain.model.FilmPickBusiness copy(@org.jetbrains.annotations.Nullable()
    java.lang.String display_title, @org.jetbrains.annotations.Nullable()
    java.lang.String mpaa_rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer critics_pick, @org.jetbrains.annotations.Nullable()
    java.lang.String byline, @org.jetbrains.annotations.Nullable()
    java.lang.String headline, @org.jetbrains.annotations.Nullable()
    java.lang.String summary_short, @org.jetbrains.annotations.Nullable()
    java.lang.String publication_date, @org.jetbrains.annotations.Nullable()
    java.lang.String opening_date, @org.jetbrains.annotations.Nullable()
    java.lang.String date_updated, @org.jetbrains.annotations.Nullable()
    com.nttdata.domain.model.FilmPickLinkBusiness link, @org.jetbrains.annotations.Nullable()
    com.nttdata.domain.model.FilmPickMultimediaBusiness multimedia) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FilmPickBusiness(@org.jetbrains.annotations.Nullable()
    java.lang.String display_title, @org.jetbrains.annotations.Nullable()
    java.lang.String mpaa_rating, @org.jetbrains.annotations.Nullable()
    java.lang.Integer critics_pick, @org.jetbrains.annotations.Nullable()
    java.lang.String byline, @org.jetbrains.annotations.Nullable()
    java.lang.String headline, @org.jetbrains.annotations.Nullable()
    java.lang.String summary_short, @org.jetbrains.annotations.Nullable()
    java.lang.String publication_date, @org.jetbrains.annotations.Nullable()
    java.lang.String opening_date, @org.jetbrains.annotations.Nullable()
    java.lang.String date_updated, @org.jetbrains.annotations.Nullable()
    com.nttdata.domain.model.FilmPickLinkBusiness link, @org.jetbrains.annotations.Nullable()
    com.nttdata.domain.model.FilmPickMultimediaBusiness multimedia) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplay_title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMpaa_rating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCritics_pick() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getByline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHeadline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSummary_short() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublication_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOpening_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate_updated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.domain.model.FilmPickLinkBusiness component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.domain.model.FilmPickLinkBusiness getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.domain.model.FilmPickMultimediaBusiness component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nttdata.domain.model.FilmPickMultimediaBusiness getMultimedia() {
        return null;
    }
}