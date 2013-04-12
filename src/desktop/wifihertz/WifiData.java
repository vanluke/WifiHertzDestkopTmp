/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop.wifihertz;

/**
 *
 * @author Łukasz
 */
public class WifiData
{
    private int imageId; private int dataId; private String wifiName;
    private long dataTime; private String wifiSsid; private int wifiRange;
    private int positionX; private int positionY;
    public WifiData()
    {
        this.imageId = 0; this.dataId=0; this.wifiName = null; this.dataTime = 0;
        this.wifiSsid = null; this.wifiRange = 0; this.positionX = 0; this.positionY = 0;
    }
    public WifiData(int imageId, int dataId, String wifiName, long dataTime, String wifiSsid, int wifiRange, int positionX, int positionY)
    {
        this.imageId = imageId; this.dataId = dataId; this.wifiName = wifiName ; this.dataTime = dataTime;
        this.wifiSsid = wifiSsid; this.wifiRange = wifiRange; this.positionX = positionX; this.positionX = positionY;
    }
    
    @Override
    public String toString()
    {
        return "imageId : " + this.imageId + " dataId : " + this.dataId + " dataTime: " + this.dataTime
                + " wifiName : " + this.wifiName + " wifiSsid : " + this.wifiSsid + " wifiRange: "
                + this.wifiRange + " positionX : " + this.positionX + " positionY " + this.positionY;
    }
}
