/**
 * <!-- ASG2a
 * 
 * <pre>
 * INSTRUCTIONS FOR READING THIS ASSIGNMENT:
 * 1. Create an Eclipse project for this assignment.
 * 2. Import this file into that project.
 * 3. In Eclipse, right-click the imported file and select Export/Java/JavaDoc
 * 4. Note the destination (look for this in the bottom 1/3 of the dialog box
 * 5. Click Finish
 * 6. Find the index.html file and double click it.
 * </pre>
 * 
 * -->
 * <h1>Asg2a: Binary Tree Node</h1>
 * <h2>Objectives</h2>
 * <ul>
 * <li>develop/improve your ability to implement a BnodeADT given its ADT</li>
 * <li>develop/improve your ability to write JUnit tests</li>
 * <li>develop/improve your ability to write readable code according to best
 * practices</li>
 * </ul>
 * <h2>Introduction</h2>
 * <p>
 * The BnodeADT defines the API for a Binary Search Tree. Note that a newly
 * created BnodeADT is empty.
 * </p>
 * <h3>Description</h3>
 * <p>
 * Refer to the notes and book for a description of a Binary Search Tree Node.
 * Our Binary Search Tree Node will store a Character.
 * </p>
 * <h3>Fluent Programming Style</h3>
 * <p>
 * Note that there are no void methods here. Methods that would normally be void
 * return the this Object so that method calls can be chained. For example:
 * 
 * <pre>
 * Suppose SetADT foo = new SetImplementation();
 * Then foo.add("a").add("b"); produces the same result as
 * foo.add("a");
 * foo.add("b");
 * </pre>
 * <p>
 * Your task is to implement this ADT, develop a JUnit test class, and document
 * both using Javadoc.
 * </p>
 * <h2>Instructions</h2>
 * <ul>
 * <li>Study the code in the textbook.</li>
 * <li>Your implementation should store Characters.</li>
 * <li>Your implementation should not use Generics.</li>
 * <li>Write the Javadoc for the JUnit class and the implementation.</li>
 * <li>Write the JUnit tests for the ADT described by this API.</li>
 * <li>Implement, using the examples in the book, the ADT described by this
 * API.</li>
 * <li>You may NOT use any pre-existing classes that defeat the purposes of this
 * assignment (ex. Tree, ArrayList, etc.)</li>
 * <li>Submit your files to Web-CAT using the eclipse menu
 * "{@code Project->Submit
 * Assignment...}"</li>
 * <li>To see my comments after I've graded your work, or to see your results at
 * any time, login to http://web-cat.cs.vt.edu</li>
 * </ul>
 * <h2>Practical Tips</h2>
 * <p>
 * Develop preliminary JUnit tests before you implement the methods, using the
 * process described in class and the slides. For example, develop tests for a
 * method, implement the method, run the tests. Do this until the method passes
 * the tests. Go on to the next method.
 * </p>
 * <p>
 * Sometimes you may have to implement a little bit as well in order to write
 * your JUnit tests. The process involves switching between JUnit tests and
 * implementation, in order to develop a good understanding of the problems to
 * be solved.
 * </p>
 * <h2>NOTES</h2>
 * <ul>
 * <li>Any submission that that uses pre-existing classes (for example, Node)
 * will receive NO CREDIT.</li>
 * <li>You may submit as many times as you like until the deadline.</li>
 * <li>The grade of your latest submission will be the one recorded.</li>
 * </ul>
 * <h2>CHECKLISTS</h2>
 * <p>
 * Check that you have done all the following.
 * <table border="1" summary="Checklist">
 * <tr>
 * <td>DONE?</td>
 * <td>TASK</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>The implementing class for this assignment is named BnodeIMP</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>There MUST be a BnodeIMP() constructor that initializes all fields to
 * null.</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>All methods specified in the ADT are implemented</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Only the ADT methods and any constructors may be declared public. Any
 * other methods declared public will result in point deductions.</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Fields used as variables may NOT be declared public.</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Code is formatted as described in piazza</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Javadoc is present in the implementation and JUnit class headers as well
 * as all non-private fields and ALL methods, as described in piazza</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Class header javadoc must include a brief description of the class, and
 * the &#64;author and &#64;version tags</td>
 * </tr>
 * </table>
 * <p>
 * Here is a table of some common things I look for when reviewing your code:
 * <a href=
 * "https://piazza-resources.s3.amazonaws.com/j6cf19dpqik109/j7qk5asq32652g/codingcomments20170918.pdf?AWSAccessKeyId=AKIAIEDNRLJ4AZKBW6HA&Expires=1505848559&Signature=lGyzsnCmvrE1r6I%2BGTkCLfoZw70%3D">
 * Coding Comments Table</a>
 * </p>
 * <p>
 * Check that you read and followed these how-to items in piazza.
 * </p>
 * <table border="1" summary="CheckHowTos">
 * <tr>
 * <td>DONE?</td>
 * <td>TASK</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: how to write JUnit tests</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: how to write readable code (and satisfy Web-CAT's format
 * checks)</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: setup Eclipse for Web-CAT</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Watch: video: setup eclipse to format your code for Web-CAT</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Read: submit your assignment to Web-CAT from within Eclipse</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Video: find formatting or code coverage errors in my source code</td>
 * </tr>
 * </table>
 *
 * @author acsiochi
 * @version 20180403 simplified
 * @version 20180316 Initial version
 */
public interface BnodeADT {

    /**
     * <p>
     * Get the address of the BNodeADT stored in this BnodeADT's left kid.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *  when BnoceADT m = n.lkid()
     *  then m == a
     * }
     * </pre>
     * 
     * @return address of the left kid of this BnodeADT
     */
    public BnodeADT lkid();

    /**
     * <p>
     * Determine if this BnodeADT is a leaf or not.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, null]
     *   and BnodeADT m == ['P', null, null]
     *  when Boolean k = n.isLeaf()
     *   and Boolean a = m.isLeaf()
     *  then k == false
     *   and a == true
     * }
     * </pre>
     * 
     * @return true if c is a leaf, false else
     */
    public Boolean isLeaf();

    /**
     * <p>
     * Get the address of the BNodeADT stored in this BnodeADT's right kid.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *  when BnodeADT m = n.rkid()
     *  then m == b
     * }
     * </pre>
     * 
     * @return address of the right kid of this BnodeADT
     */
    public BnodeADT rkid();

    /**
     * <p>
     * Set the left kid stored in this BnodeADT to the given address.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *  when BnodeADT m = n.setLkidTo(x)
     *  then n.lkid() == x
     *   and m == n
     * }
     * </pre>
     * 
     * @param n the address to store in this BnodeADT's left
     * @return the address of this BnodeADT
     */
    public BnodeADT setLkidTo(BnodeADT n);

    /**
     * <p>
     * Set the right kid stored in this BnodeADT to the given address.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', a, b]
     *  when BnodeADT m = n.setRkidTo(x)
     *  then n.rkid() == x
     *   and m == n
     * }
     * </pre>
     * 
     * @param n the address to store in this BnodeADT's right
     * @return the address of this BnodeADT
     */
    public BnodeADT setRkidTo(BnodeADT n);

    /**
     * <p>
     * Set the Character stored in this BnodeADT to the given Character.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', null, null]
     *  when BnodeADT m = n.setValTo('x')
     *  then n.val() == 'x'
     *   and m == n
     * }
     * </pre>
     * 
     * @param c the Character to store in this BnodeADT
     * @return the address of this BnodeADT
     */
    public BnodeADT setValTo(Character c);

    /**
     * <p>
     * toString should return a string of the form [value, lkid, rkid]. The code
     * for this is provided for you. DO NOT MODIFY IT.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT a == ['x', null, null];
     *  when String s = a.toString();
     *  then s == "['x', null, null]"
     * }
     * </pre>
     * 
     * @return the string representation of this BnodeADT
     */
    public String toString();

    /**
     * <p>
     * Get the Character stored in this BnodeADT.
     * </p>
     * <h3>Example</h3>
     * 
     * <pre>
     * {@code
     * Given BnodeADT n == ['c', null, null]
     *  when Character m = n.val()
     *  then m == 'c'
     * }
     * </pre>
     * 
     * @return value stored in this BnodeADT
     */
    public Character val();

}
