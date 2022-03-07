## Run
In order to start running the project run *run/run.sh*

### Task
- Create an API Gateway to redirect the client request to *Savings Services* A and B. It should
    - run on port 8080
    - respond in less than 5 seconds, else throw a timeout.
    - log to file all incoming requests as *info* level
- Create a Savings Service A which should be able to keep the balance of your savings account A. It should be able to:
    - run on port 8081
    - return the current balance for account A
    - increase/decrease the balance for account A
    - persist the balance in a PostgreSQL database. Feel free to define your schema.
- Clone the *Savings Service A* into a new *Savings Service B*.
    - run on port 8082
    - return the current balance for account B
    - increase/decrease the balance for account B
- Provide a GitHub repository with the code, test instructions, and your comments.
- Also describe how you would
    - scale your API gateway?
    - monitor uptime so you can sleep at night?

### Constraints

- Use Java Spring Boot

### Food for thought

- Dockerize your dev environment as much as possible
- How would you test the timeouts? 🤔

### Bonus task

- Secure your gateway


## Remarks
#### Remark 1
Why: Use Java Spring Boot? For Gateway there are better candidates.
#### Remark 2
Looks like I forgot to do "log to file all incoming requests as info level". 
Just realized it when was pushing my code to the github.
#### Remark 3:Extra tasks: Scale your API gateway
Well, a lot of different options.
Starting from editing config files and ending up using discovery service providers (Eureka for example).
We can talk more about the next interview step.
#### Remark 4:Extra tasks: Monitor uptime so you can sleep at night
Eureka service discovery. We can talk more about the next interview step.
#### Remark 4: Security
Plenty of things should be done. We can talk more about the next interview step.
#### Remark 5: To test "respond in less than 5 seconds, else throw a timeout"
Well, that's quit tricky. We can talk about it later.