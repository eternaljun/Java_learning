package part1.chapter3;

// Скомпилировать эту программу нельзя
public class ScopeErr {
    public static void main(String[] args) {
        int bare = 1;
        {                // создается новая область видимости
            int bar = 2; // Ошибка во время компиляции
                         // переменная bar уже определена!
        }
    }
}
