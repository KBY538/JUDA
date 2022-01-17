package ac.kr.smu.JUDA.board.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UploadFileResponse {

    private String fileName;
    private String fileDownloadUri;
    private String contentType;
    private long size;

    public UploadFileResponse(String fileName, String fileDownloadUri, String contentType, long size){
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.contentType = contentType;
        this.size = size;
    }
}
