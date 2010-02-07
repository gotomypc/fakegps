package net.sourcewalker.fakegps.data;

import java.util.List;

public interface IDataModel {

    public abstract void addWaypoint(GpsWaypoint wp);

    public abstract List<GpsWaypoint> getWaypoints();

    public abstract boolean isNormalPoint(GpsWaypoint wp);

    public abstract boolean isEndPoint(GpsWaypoint wp);

    public abstract boolean isStartPoint(GpsWaypoint wp);

}