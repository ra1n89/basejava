import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10];
    int firstNullElement = 0;

    void clear() {
        int i = 0;
        while (storage[i] != null) {
            storage[i] = null;
            i++;
        }
    }

    void save(Resume r) {
        storage[firstNullElement] = r;
        firstNullElement++;

    }

    Resume get(String uuid) {
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < 10000; i++) {
            if (storage[i] == null) {
                System.out.println("Отсутствует такое резюме");
                break;
            }
            if (storage[i].uuid.equals(uuid)) {
                System.arraycopy(storage, i+1, storage, i, firstNullElement - i);
                firstNullElement--;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return storage;
    }

    int size() {
        return firstNullElement-1;
    }
}
