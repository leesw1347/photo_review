package Chapter6.Part1;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class WikiNodeExample {
    public static void main(String[] args) throws IOException {
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        // download and parse the document
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();

        // select the content text and pull out the paragraphs;
        Element content = document.getElementById("mw-content-text");

        // TODO: avoid selecting paragraphs from sidebars and boxouts
        Elements paras = content.select("p");
        Element firstPara = paras.get(1);

        recursiveDFS(firstPara);
        System.out.println();

        iterativeDFS(firstPara);
        System.out.println();

//        Iterable<Node> iter = new WikiNodeIterable(firstPara);
//        for (Node node : iter) {
//            if (node instanceof TextNode) {
//                System.out.print(node);
//            }
//        }
    }

    private static void iterativeDFS(Element firstPara) {
        System.out.println("firstPara " + firstPara);
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(firstPara);

        // if the stack is empty, we`re done
        while (!stack.isEmpty()) {
            // otherwise, pop the next Node off the stack
            Node node = stack.pop();
            if (node instanceof TextNode) {
                System.out.print(node);
            }

            // push the children onto the stack in reverse order
            List<Node> nodes = new ArrayList<>(node.childNodes());
//            System.out.println("reverse 전 " + nodes);
            Collections.reverse(nodes); // 자식노드를 거꾸로 올린다 (ArrayDeque이기 때문에 pop이 반대로 되면 거꾸로 출력되기 때문에 childNodes에서 Collections.reverse를 통해서 list의 데이터를 반대로 엮어준다
//            System.out.println("reverse 후 " + nodes);
            for (Node child : nodes) {
                stack.push(child);
            }
        }
    }

    private static void recursiveDFS(Node node) {
        if (node instanceof TextNode) {
            System.out.print(node);
        }
        for (Node child : node.childNodes()) { // 각 태그별로 자식 노드를 전체를 iterate 돌면서 출력해준다
            recursiveDFS(child);
        }
    }
}
