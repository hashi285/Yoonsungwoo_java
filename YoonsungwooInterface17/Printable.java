package YoonsungwooInterface17;

public interface Printable {
    public void print(String doc);
}


interface Printable2 {
    public static final int PAPER_WIDRH = 70;
    public static final int PAPER_HEIGHT = 80;
    public void print(String doc);
}

// 인터페이스는 public가 없어도 자동으로 삽입이 되어 있다
//doc는 문서를 의미합니다. 특히 컴퓨팅에서는 워드 처리 문서를 위한 파일 확장자로 사용됩니다.
// 대개 마이크로소프트 워드에서 사용되며, 이미지, 형식이 지정된 텍스트, 표, 차트 및 워드 프로세서에 일반적으로 사용되는 기타 요소를 저장할 수 있습니다.
// 다시 말해, .doc 확장자는 한글파일과 같은 문서 편집 파일입니다. 😊