user1 = input("Enter first user name: ")
user2 = input("Enter first user name: ")

while True:
    user1_answer = input(user1 + ",do you want to choose rock, paper or scissors? ").lower()
    user2_answer = input(user2 + ",do you want to choose rock, paper or scissors? ").lower()

    if user1_answer == user2_answer:
         print("Its a  tie")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print("Rock wins")
        else:
            print("Paper wins")
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print("Paper wins")
        else:
            print("Rock wins")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins")
        else:
            print("Scissor wins")
#    elif (user1_answer == 'rock' and user2_answer == 'scissors'):
#        print("Rock wins")
#    elif (user1_answer == 'paper' and user2_answer == 'scissors'):
#         print("Scissor wins")
#    elif (user1_answer == 'rock' and user2_answer == 'paper'):
#         print("Paper wins")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat = input("Do you want to play the game ").lower()
    if (repeat == "yes"):
         pass
    elif (repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
