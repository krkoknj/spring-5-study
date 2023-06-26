package com.study.ch2.decoupled;

/**
 * 출력 메시지를 랜더링하는 모든 컴포넌트에서 구현 해야함.
 */
public interface MessageRenderer {
    void render();

    // MessageProvider에게 메시지를 가져오는 책임을 위임한다.
    // MessageProvider는 MessageRenderer와 의존성이 있다.
    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
