/*
//...
public static final String MESSAGE_ADD_REMARK_SUCCESS = "Added remark to Person: %1$s";
public static final String MESSAGE_DELETE_REMARK_SUCCESS = "Removed remark from Person: %1$s";
//...
@Override
public CommandResult execute(Model model) throws CommandException {
    List<Person> lastShownList = model.getFilteredPersonList();

    if (index.getZeroBased() >= lastShownList.size()) {
        throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
    }

    Person personToEdit = lastShownList.get(index.getZeroBased());
    Person editedPerson = new Person(
            personToEdit.getName(), personToEdit.getPhone(), personToEdit.getEmail(),
            personToEdit.getAddress(), remark, personToEdit.getTags());

    model.setPerson(personToEdit, editedPerson);
    model.updateFilteredPersonList(PREDICATE_SHOW_ALL_PERSONS);

    return new CommandResult(generateSuccessMessage(editedPerson));
}

*/
/**
 * Generates a command execution success message based on whether
 * the remark is added to or removed from
 * {@code personToEdit}.
 *//*

private String generateSuccessMessage(Person personToEdit) {
    String message = !remark.value.isEmpty() ? MESSAGE_ADD_REMARK_SUCCESS : MESSAGE_DELETE_REMARK_SUCCESS;
    return String.format(message, Messages.format(personToEdit));
}
*/
