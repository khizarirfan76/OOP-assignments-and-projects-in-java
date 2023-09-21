public class employee {

        String firstName;
        String lastName;

        public employee(String firstName,String lastName)
        {
            this.firstName=firstName;
            this.lastName=lastName;
        }

        @Override
        public String toString() {
            return firstName+" "+lastName;
        }

    }

