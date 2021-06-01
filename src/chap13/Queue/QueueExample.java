package chap13.Queue;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.out;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();
        out.println(messageQueue);

        messageQueue.offer(new Message("sendMail", "홍길동"));
        out.println(messageQueue);

        messageQueue.offer(new Message("sendSMS", "신용권"));
        out.println(messageQueue);

        messageQueue.offer(new Message("sendKakaoTalk", "홍두께"));
        out.println(messageQueue);

        while (!messageQueue.isEmpty()) {
            Message msg = messageQueue.poll();
            out.println(msg);

            switch (msg.command) {
                case "sendMail":
                    out.println(msg.to + " 님에게 메일을 보냅니다");
                    break;

                case "sendSMS":
                    out.println(msg.to + " 님에게 SMS를 보냅니다");
                    break;

                case "sendKakaoTalk":
                    out.println(msg.to + " 님에게 카카오톡을 보냅니다");
                    break;
            }
        }
    }
}
