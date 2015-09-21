package at.ac.tuwien.ifs;

/**
 * Created by artur on 16/09/15.
 */
public class ImageBean {
    public String getOriginal() {
        return Original;
    }

    public void setOriginal(String original) {
        Original = original;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getOriginal_TIF() {
        return Original_TIF;
    }

    public void setOriginal_TIF(String original_TIF) {
        Original_TIF = original_TIF;
    }

    public String getResult_TIF() {
        return Result_TIF;
    }

    public void setResult_TIF(String result_TIF) {
        Result_TIF = result_TIF;
    }

    public Double getSSIM() {
        return SSIM;
    }

    public void setSSIM(Double SSIM) {
        this.SSIM = SSIM;
    }
    public ImageBean(Double SSIM, Boolean isSimilar,  String Original,String Result,String Original_TIF,String Result_TIF){
        this.SSIM=SSIM;
        this.isSimilar= isSimilar;
        this.Original=Original;
        this.Result=Result;
        this.Original_TIF=Original_TIF;
        this.Result_TIF=Result_TIF;
    }
    public ImageBean(){}

    String Original, Result, Original_TIF, Result_TIF;
    Double SSIM;

    public Boolean getIsSimilar() {
        return isSimilar;
    }

    public void setIsSimilar(Boolean isSimilar) {
        this.isSimilar = isSimilar;
    }

    Boolean isSimilar;

}
