# Program Specification

### Purpose:

To find the maximum number of people allowed in a rectangular classroom based on regulations from different education authorities about volume of minimum air space which each person must have.  


### Scope:	

The deliverables for this development include:

-	working modular program

No testing or evaluation will be carried out here.

### Boundaries:	

The program will be a purely text based interface.  The user keys in the length, breadth and height of the room in metres and the permitted air space per pupil in cubic metres. It is a conventional rectangular room.

###  Assumptions:	

- Room is a perfect cuboid - there are no odd corners or recesses.
- Length & breadth is in range 2 - 20 m and height in range 2 - 10 m.
- Permitted airspace per pupil is in cubic metres in range 5 - 15 m3.
- Maximum number of pupils allowed must be a whole number.

### Inputs:	

- length of room 
- breadth of room 
- height of room	 
- permitted airspace 

### Processes:	

- Validate inputs for length, breadth and height
- Calculation of room volume
- Calculation of maximum number of people allowed

### Outputs:	

- Maximum number of people allowed in classroom

From the exemplar on the previous pages, you should now be capable of translating a design with data flow into a modular program with parameters.

Carefully read the program specification on the opposite page to make sure you understand what is required of this program. 

Finally use the top-down design given below to code the program in Main.java. Your program structure, its components, variables and parameters (formal and actual) should reflect all the detail implied by the design.

### Top Level Algorithm

RECORD STRUCTURE ClassRoom BEGIN\
REAL length\
REAL breadth\
REAL height\
REAL airSpace\
END RECORD

1	get dimensions and permitted airspace                       	(out:room)\
2	calculate allowable people                  	(in: room; out: persons)\
3	display persons                                 (in:persons)

### Refinements

**1.1**	Display 'Enter length of room in m'\
**1.2**	Get valid value\
**1.3**	Display  'Enter breadth of room in m ' \
**1.4**	Get valid value\
**1.5**	Display  'Enter height of room in m ' \
**1.6**	Get valid value 	\
**1.7**	Display  'Enter regulation airpace in m cubed' \
**1.8**	Get valid value	
	
**2.1**	roomVol = length x breadth x height\
**2.2**	persons  = the integer value of roomVol / airspace

**1.2.1**	Get num \
**1.2.2**	Start conditional loop while num < min OR num > max \
**1.2.3**		Display error message\
**1.2.4**		Get num\
**1.2.5** 	End conditional loop


**Note:** The refinements for 1.2 will also be applied to 1.4, 1.6 and 1.8\
This can be done by creating a function to return a valid number given the min, max, and message



