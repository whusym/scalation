<html>
<head>
<LINK href="style.css" rel="stylesheet" type="text/css">
<title> ScalaTion </title>
</head>
<body>

<center>
<h1> SCALAble SimulaTION - ScalaTion </h1>
<p>
<a href = "#papers">Papers</a> | <a href = "#scaladoc">Scaladoc</a> | <a href = "#source-code"> Source Code</a>
</center>

<p>
<b> Welcome to ScalaTion, the Scala-based system for Simulation, Optimization and Analytics. </b>

<p>
This system, coded in Scala, supports multi-paradigm simulation modeling including
'tableau', 'event', 'process', 'dynamics', 'dynamics_pde', 'activity' and 'state' oriented models.

<p>
<a href = "http://www.scala-lang.org">Scala</a> is a modern object-oriented, functional programming language
<!-- (see <a href = "feature_matrix.html"> feature matrix </a>) -->
that is well-suited for developing simulation engines.
It is in the Java family of languages and can call Java code.
The inclusion of advanced and functional programming capabilities,
makes the code much more concise than Java.
ScalaTion also supports optimization and analytics as they nowadays go hand-in-hand with simulation modeling.
Some of the algorithms come in both sequential and parallel versions.

<p>
The <b>ScalaTion 1.2</b> version defines multiple .par subpackages that contain parallel versions of sequential algorithms.
Future directions include completing the 'scala3d' and 'physics' packages.

<p>
Please read the <a href = LICENSE.html> LICENSE </a> file (an MIT style license).

<p><hr><p>
<h3> Installation Instructions </h3>

Requires:
<a href = "http://www.scala-lang.org/downloads">Scala 2.12.x</a> and
<a href = "http://www.oracle.com/technetwork/java/javase/downloads">Java 8</a>
<br>
Recommended:
<a href = "http://www.scala-sbt.org/">sbt</a> &nbsp;
(see <a href = "http://www.scala-sbt.org/0.13/tutorial/Setup.html">Setup.html</a>)

<h4>1. Download one of the following two files</h4>

<a href = "../scalation_1.2.tar.gz"> scalation_1.2.tar.gz </a> <br> <b>OR</b> <br>
<a href = "../scalation_1.2.zip"> scalation_1.2.zip </a>

<p>
<h4>2. Untar or unzip the file</h4>

<pre><code>
$ tar xvfz scalation_1.2.tar.gz <br> <b>OR</b> <br>
$ unzip scalation_1.2.zip
</code></pre>

<!--
<p>
<h4>3. Export the SCALATION_CLASSES environment variable to point at class files</h4>

<pre><code>
export SCALATION_CLASSES=$HOME/scalation_1.2/target/scala-2.12.0-M2/classes
</code></pre>

<p>
Adjust the prefix to correspond to where you installed scalation.
Ideally, put the export in one of your dot files (e.g., .profile or .bashrc).
-->

<h4>3. To compile code or run apps, enter sbt and type compile, run-main or exit </h4>

<pre><code>
$ cd scalation_1.2 <br>
$ sbt <br>
> compile <br>
> run-main apps.process.Bank <br>
> run-main scalation.analytics.RegressionTest <br>
> exit
</code></pre>

<p>
ScalaTion 1.2 is set up to use the Simple Build Tool <a href = "http://www.scala-sbt.org">sbt</a>.

<p>
ScalaTion 1.2 uses the following build specification file
<a href = "build.sbt">build.sbt</a>.
Source packages are in the <b>src/main/scala</b> directory,
class files are in the <b>target/scala-2.12.0-M2/classes</b> directory, and
documentation files are in the <b>target/scala-2.12.0-M2/api</b> directory.
Data file input, output or analytics are stored in subdirectories of <b>data</b>,
while database files are stored in <b>store</b>.

<!--
<h4>4. Run apps (e.g., for process oriented simulation in Bank.scala)</h4>

<pre><code>
$ scar apps.process.Bank <br> <b>OR</b> <br>
$ scala -cp $SCALATION_CLASSES apps.process.Bank
</code></pre>

<p>

The '<a href = "scar">scar</a>' shell script works for Linux, Unix and Mac.
Use '<a href = "scar.bat">scar.bat</a>' for Windows.
</code></pre>

<h4>5. Run src test code (e.g., for Regression in scalation.analytics)</h4>

<pre><code>
$ scar scalation.analytics.RegressionTest <br> <b>OR</b> <br>
$ scala -cp $SCALATION_CLASSES scalation.analytics.RegressionTest
</code></pre>
-->

<p><hr><p>

To develop using an IDE:
<ol>
<li>
Download <a href = "http://typesafe.com/stack/downloads/scala-ide">Scala IDE for Eclipse</a>
<li>
Extract the downloaded .zip/.tar.gz file
<li>
Start eclipse by running the eclipse command or clicking eclipse application from the file manager
<li>
Create and run HelloWorld.scala, see <a href = "https://www.assembla.com/spaces/scala-ide/wiki/tutorial">tutorial</a>
</ol>

<p>
For more information about the source code, see 
<a href = "src/README_src.hmtl">src/README_src.hmtl</a>.

<A name = "papers">

<p><hr><p>
<h3> Papers/Documentation </h3>
<p>

<ol>
<li>
John A. Miller, Jun Han and Maria Hybinette,
<a href = "http://informs-sim.org/wsc10papers/067.pdf">
"Using Domain Specific Languages for Modeling and Simulation: ScalaTion as a Case Study,"</a>
Proceedings of the 2010 ACM/IEEE Winter Simulation Conference (WSC'10),
Baltimore, Maryland (December 2010) pp. 741-752.

<p>
<li>
Michael E. Cotterell, John A. Miller, Tom Horton,
<a href = "http://arxiv.org/abs/1112.1751">
"Unicode in Domain-Specific Programming Languages for Modeling & Simulation:
ScalaTion as a Case Study,"</a>
Arxiv preprint arXiv:1112.175
(December 2011) pp. 1-10.

<p>
<li>
Michael E. Cotterell, John A. Miller, Jun Han and Tom Horton,
<a href = "../scalation_papers/alasim/alasim_extended_abstract.pdf">
"Extending ScalaTion, a Domain-Specific Language for Modeling & Simulation, for Simulation Optimization,"</a>
Proceedings of the AlaSim International Modeling and Simulation Conference & Exhibition (AlaSim'12),
Huntsville, Alabama (May 2012) pp. 1-1.

<p>
<li>
Yung Long Li,
<a href = "../home/theses/li_thesis/thesis/TR_Yung_Long_Li.pdf">
"Evaluation of Parallel Implementations of Dense and Sparse
Matrices for the ScalaTion Library," </a>
Technical Report,
University of Georgia (December 2012) pp. 1-60.

<p>
<li>
John A. Miller, Michael E. Cotterell and Stephen J. Buckley,
<a href = "http://informs-sim.org/wsc13papers/includes/files/104.pdf">
"Supporting a Modeling Continuum in ScalaTion: From Predictive Analytics to Simulation Modeling,"</a>
Proceedings of the 2013 ACM/IEEE Winter Simulation Conference (WSC'13),
Washington, DC (December 2013) pp. 1191-1202. 

<p>
<li>
Matthew Saltz, Ayushi Jain, Abhishek Kothari, Arash Fard, John A. Miller, and Lakshmish Ramaswamy,
<a href = "http://www.thecloudcomputing.org/2014/AdvanceProgram-ICWS-SCC-CLOUD-MS-BigDataCongress-SERVICES-2014.pdf">
"DualIso: An Algorithm for Subgraph Pattern Matching on Very Large Labeled Graphs,"</a>
<I> Proceedings of the 3rd IEEE International Congress on Big Data </I>
(<a href = "http://www.ieeebigdata.org/2014">BigData'14</a>),
Anchorage, Alaska (June-July 2014) pp. 498-505.
<br>
Online <a href = "../home/theses/jain_thesis/bigdata_2014/BigDataCong2014_DualIso_Supplement.pdf">supplement</a>

</ol>
<A name = "scaladoc">

<p><hr><p>
<h3> Source Packages (doc) </h3>
<p>

<p>
Overall scaladoc generated <a href = "target/scala-2.12.0-M2/api"> API </a> for ScalaTion
<p>

<blockquote>
<table border = 3>
<tr>
<td> <b>Package</b>
<td> <b>Description</b>
<tr>
<tr>
~/scalation_1.2/target/scala-2.12.0-M2/api
<td> <a href = "target/scala-2.12.0-M2/api/scalation/util/package.html"> scalation.util </a>
<td> A package of utilities needed by the other packages.
<tr>
<td> - <a href = "target/scala-2.12.0-M2/api/scalation/util/bld/package.html"> scalation.util.bld </a>
<td> A subpackage of for building util implementations.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/scala2d/package.html"> scalation.scala2d </a>
<td> A package supporting 2D graphics based on Java 2D.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/scala3d/package.html"> scalation.scala3d </a>
<td> A package supporting 3D graphics based on JavaFX 3D (Under development).
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/math/package.html"> scalation.math </a>
<td> A package of mathematical objects and operations needed for analytics, simulation and optimization.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/linalgebra/package.html"> scalation.linalgebra </a>
<td> A package of implementations for linear algebra (e.g., for vectors and matrices).
Vectors and matrices of real (Double), rational and complex numbers are supported.
<tr>
<td> - <a href = "target/scala-2.12.0-M2/api/scalation/linalgebra/bld/package.html"> scalation.linalgebra.bld </a>
<td> A subpackage for building implementations for linear algebra (e.g., for vectors and matrices).
<tr>
<td> - <a href = "target/scala-2.12.0-M2/api/scalation/linalgebra/gen/package.html"> scalation.linalgebra.gen </a>
<td> A subpackage of generic implementations for linear algebra (e.g., for vectors and matrices).
Vectors and matrices of types implementing Numeric can be instantiated.
<tr>
<td> - <a href = "target/scala-2.12.0-M2/api/scalation/linalgebra/mem_mapped/package.html"> scalation.linalgebra.mem_mapped </a>
<td> A subpackage for memory mapped linear algebra (e.g., for vectors and matrices).
<tr>
<td> - - <a href = "target/scala-2.12.0-M2/api/scalation/linalgebra/mem_mapped/bld/package.html"> scalation.linalgebra.mem_mapped.bld </a>
<td> A sub-subpackage for building implementations for memory mapped linear algebra (e.g., for vectors and matrices).
<tr>
<td> - <a href = "target/scala-2.12.0-M2/api/scalation/linalgebra/par/package.html"> scalation.linalgebra.par </a>
<td> A subpackage of parallel implementations for linear algebra.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/relalgebra/package.html"> scalation.relalgebra </a>
<td> A package of implementations for columnar relational algebra.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/calculus/package.html"> scalation.calculus </a>
<td> A package for computing derivatives, gradients and Jacobians.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/random/package.html"> scalation.random </a>
<td> A package for random numbers and random variates (Normal distribution, etc.)
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/stat/package.html"> scalation.stat </a>
<td> A package of statistical objects and operations needed for simulation,
including implementations for summary statitistics and ANOVA.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/plot/package.html"> scalation.plot </a>
<td> A package for displaying basic plots and histograms.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/model/package.html"> scalation.model </a>
<td> A package defining the general form of a model.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/animation/package.html"> scalation.animation </a>
<td> A package supplying a general purpose animation engine.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/minima/package.html"> scalation.minima </a>
<td> A package supporting simulation optimization (minimization).
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/maxima/package.html"> scalation.maxima </a>
<td> A package supporting simulation optimization (maximization).
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/analytics/package.html"> scalation.analytics </a>
<td> A package supporting analytics, including regression, time series analysis and clustering.
<tr>
<td> - <a href = "target/scala-2.12.0-M2/api/scalation/analytics/par/package.html"> scalation.analytics.par </a>
<td> A subpackage supporting parallel analytics, including regression, time series analysis and clustering.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/graphalytics/package.html"> scalation.graphalytics </a>
<td> A package supporting graph analytics, including shortest path, subgraph isomorphism, etc.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/metamodel/package.html"> scalation.metamodel </a>
<td> A package supporting simulation metamodeling, espcially for optimization.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/queueingnet/package.html"> scalation.queueingnet </a>
<td> A package supporting queueing network models.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/tableau/package.html"> scalation.tableau </a>
<td> A simulation engine for tableau oriented (spreedsheet like) models.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/event/package.html"> scalation.event </a>
<td> A simulation engine for event oriented models such as Event Scheduling or Event Graphs.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/process/package.html"> scalation.process </a>
<td> A simulation engine for process oriented models such as Process-Interaction Models.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/dynamics/package.html"> scalation.dynamics </a>
<td> A simulation engine for systems dynamics (continuous simulation), which includes
general-purpose Ordinary Differential Equation (ODE) solvers.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/dynamics_pde/package.html"> scalation.dynamics_pde </a>
<td> A simulation engine for systems dynamics (continuous simulation), which includes
category-specific Partial Differential Equation (PDE) solvers.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/physics/package.html"> scalation.physics </a>
<td> A physics engine for simulation based games (Under development).
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/activity/package.html"> scalation.activity </a>
<td> A simulation engine for activity oriented models such as Petri Nets.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/scalation/state/package.html"> scalation.state </a>
<td> A simulation engine for state oriented models such as Markov Chains.
<tr>
<tr>
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/activity/package.html"> apps.activity </a>
<td> Example models for activity oriented models such as Petri Nets.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/analytics/package.html"> apps.analytics </a>
<td> Example analytics problems.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/dynamics/package.html"> apps.dynamics </a>
<td> Example models for systems dynamics (continuous simulation).
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/event/package.html"> apps.event </a>
<td> Example models for event oriented models such as Event Graphs.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/game/package.html"> apps.game </a>
<td> Example simulation-oriented games.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/montecarlo/package.html"> apps.montecarlo </a>
<td> Example Monte Carlo simulation.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/optimization/package.html"> apps.optimization </a>
<td> Example optimization problems.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/process/package.html"> apps.process </a>
<td> Example models for process oriented models such as Process-Interaction Models.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/simopt/package.html"> apps.simopt </a>
<td> Example simulation optimization problems.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/state/package.html"> apps.state </a>
<td> Example models for state oriented models such as Markov Chains.
<tr>
<td> <a href = "target/scala-2.12.0-M2/api/apps/tableau/package.html"> apps.tableau </a>
<td> Example models for tableau oriented (spreadheet like) models.
</table>
</blockquote>

<A name = "source-code">

<p>
<h3> Source Packages (src) </h3>
<p>

<blockquote>
<table border = 3>
<tr>
<td> <b>Package</b>
<td> <b>Description</b>
<tr>
<tr>
<td> <a href = "src/main/scala/scalation/util/"> scalation.util </a>
<td> A package of utilities needed by other packages.
<tr>
<td> - <a href = "src/main/scala/scalation/util/bld/"> scalation.util.bld </a>
<td> A subpackage of for building util implementations.
<tr>
<td> <a href = "src/main/scala/scalation/scala2d/"> scalation.scala2d </a>
<td> A package supporting 2D graphics based on Java 2D.
<tr>
<td> <a href = "src/main/scala/scalation/scala3d/"> scalation.scala3d </a>
<td> A package supporting 3D graphics based on JavaFX 3D (Under development).
<tr>
<td> <a href = "src/main/scala/scalation/math/"> scalation.math </a>
<td> A package of mathematical objects and operations needed for analytics, simulation and optimization,
<tr>
<td> <a href = "src/main/scala/scalation/linalgebra/"> scalation.linalgebra </a>
<td> A package of implementations for linear algebra (e.g., for vectors and matrices).
Vectors and matrices of real (Double) and complex numbers are supported.
<tr>
<td> - <a href = "src/main/scala/scalation/linalgebra/bld/"> scalation.linalgebra.bld </a>
<td> A subpackage for building implementations for linear algebra (e.g., for vectors and matrices).
<tr>
<td> - <a href = "src/main/scala/scalation/linalgebra/gen/"> scalation.linalgebra.gen </a>
<td> A subpackage of generic implementations for linear algebra (e.g., for vectors and matrices).
Vectors and matrices of types implementing Numeric can be instantiated.
<tr>
<td> - <a href = "src/main/scala/scalation/linalgebra/mem_mapped/"> scalation.linalgebra.mem_mapped </a>
<td> A subpackage for memory mapped linear algebra (e.g., for vectors and matrices).
<tr>
<td> - - <a href = "src/main/scala/scalation/linalgebra/mem_mapped/bld/"> scalation.linalgebra.mem_mapped.bld </a>
<td> A sub-subpackage for building implementations for memory mapped linear algebra (e.g., for vectors and matrices).
<tr>
<td> - <a href = "src/main/scala/scalation/linalgebra/par/"> scalation.linalgebra.par </a>
<td> A subpackage of parallel implementations for linear algebra.
<tr>
<td> <a href = "src/main/scala/scalation/relalgebra/"> scalation.relalgebra </a>
<td> A package of implementations for columnar relational algebra.
<tr>
<td> <a href = "src/main/scala/scalation/calculus/"> scalation.calculus </a>
<td> A package for computing derivatives, gradients and Jacobians.
<tr>
<td> <a href = "src/main/scala/scalation/random/"> scalation.random </a>
<td> A package for random numbers and random variates (Normal distribution, etc.)
<tr>
<td> <a href = "src/main/scala/scalation/stat/"> scalation.stat </a>
<td> A package of statistical objects and operations needed for simulation,
including implementations for summary statitistics and ANOVA.
<tr>
<td> <a href = "src/main/scala/scalation/plot/"> scalation.plot </a>
<td> A package for displaying basic plots and histograms.
<tr>
<td> <a href = "src/main/scala/scalation/model/"> scalation.model </a>
<td> A package defining the general form of a model.
<tr>
<td> <a href = "src/main/scala/scalation/animation/"> scalation.animation </a>
<td> A package supplying a general purpose animation engine.
<tr>
<td> <a href = "src/main/scala/scalation/minima/"> scalation.minima </a>
<td> A package supporting simulation optimization (minimization).
<tr>
<td> <a href = "src/main/scala/scalation/maxima/"> scalation.maxima </a>
<td> A package supporting simulation optimization (maximization).
<tr>
<td> <a href = "src/main/scala/scalation/analytics/"> scalation.analytics </a>
<td> A package supporting analytics, including regression, time series analysis and clustering.
<tr>
<td> - <a href = "src/main/scala/scalation/analytics/par/"> scalation.analytics.par </a>
<td> A subpackage supporting parallel analytics, including regression, time series analysis and clustering.
<tr>
<td> <a href = "src/main/scala/scalation/graphalytics/"> scalation.graphalytics </a>
<td> A package supporting graph analytics, including shotest path, subgraph isomorphism, etc.
<tr>
<td> <a href = "src/main/scala/scalation/metamodel/"> scalation.metamodel </a>
<td> A package supporting simulation metamodeling, especially for optimization.
<tr>
<td> <a href = "src/main/scala/scalation/queueingnet/"> scalation.queueingnet </a>
<td> A package supporting queueing network models.
<tr>
<td> <a href = "src/main/scala/scalation/tableau/"> scalation.tableau </a>
<td> A simulation engine for tableau oriented (spreedsheet like) models.
<tr>
<td> <a href = "src/main/scala/scalation/event/"> scalation.event </a>
<td> A simulation engine for event oriented models such as Event Scheduling or Event Graphs.
<tr>
<td> <a href = "src/main/scala/scalation/process/"> scalation.process </a>
<td> A simulation engine for process oriented models such as Process-Interaction Models.
<tr>
<td> <a href = "src/main/scala/scalation/dynamics/"> scalation.dynamics </a>
<td> A simulation engine for systems dynamics (continuous simulation), which includes
general-purpose Ordinary Differential Equation (ODE) solvers.
<tr>
<td> <a href = "src/main/scala/scalation/dynamics_pde/"> scalation.dynamics_pde </a>
<td> A simulation engine for systems dynamics (continuous simulation), which includes
category-specific Partial Differential Equation (PDE) solvers.
<tr>
<td> <a href = "src/main/scala/scalation/physics/"> scalation.physics </a>
<td> A physics engine for simulation based games (Under development).
<tr>
<td> <a href = "src/main/scala/scalation/activity/"> scalation.activity </a>
<td> A simulation engine for activity oriented models such as Petri Nets.
<tr>
<td> <a href = "src/main/scala/scalation/state/"> scalation.state </a>
<td> A simulation engine for state oriented models such as Markov Chains.
<tr>
<tr>
<tr>
<td> <a href = "src/main/scala/apps/activity/"> apps.activity </a>
<td> Example models for activity oriented models such as Petri Nets.
<tr>
<td> <a href = "src/main/scala/apps/analytics/"> apps.analytics </a>
<td> Example analytics problems.
<tr>
<td> <a href = "src/main/scala/apps/dynamics/"> apps.dynamics </a>
<td> Example models for systems dynamics (continuous simulation).
<tr>
<td> <a href = "src/main/scala/apps/event/"> apps.event </a>
<td> Example models for event oriented models such as Event Graphs.
<tr>
<td> <a href = "src/main/scala/apps/game/"> apps.game </a>
<td> Example simulation-oriented games.
<tr>
<td> <a href = "src/main/scala/apps/montecarlo/"> apps.montecarlo </a>
<td> Example Monte Carlo simulation.
<tr>
<td> <a href = "src/main/scala/apps/optimization/"> apps.optimization </a>
<td> Example optimization problems.
<tr>
<td> <a href = "src/main/scala/apps/process/"> apps.process </a>
<td> Example models for process oriented models such as Process-Interaction Models.
<tr>
<td> <a href = "src/main/scala/apps/simopt/"> apps.simopt </a>
<td> Example simulation optimization problems.
<tr>
<td> <a href = "src/main/scala/apps/state/"> apps.state </a>
<td> Example models for state oriented models such as Markov Chains.
<tr>
<td> <a href = "src/main/scala/apps/tableau/"> apps.tableau </a>
<td> Example models for tableau oriented (spreadheet like) models.
</table>
</blockquote>

<!--

<p>
<h3> Source Packages for JalaTion (Under Development) </h3>
<p>

<blockquote>
<table border = 3>
<tr>
<td> <b>Package</b>
<td> <b>Description</b>
<tr>
<tr>
<td> <a href = "src/main/java/jalation/util/"> jalation.util </a>
<td> A package of utilities needed by other packages.
<tr>
<td> <a href = "src/main/java/jalation/analytics/"> jalation.analytics </a>
<td> A package supporting analytics, including regression, time series analysis and clustering.
<tr>
<td> <a href = "src/main/java/jalation/graphalytics/"> jalation.graphalytics </a>
<td> A package supporting graph analytics, including shotest path, subgraph isomorphism, etc.
</table>
</blockquote>

-->

<p>
<h3> Code Generators (Under Development) </h3>
<p>

<blockquote>
<table border = 3>
<tr>
<td> <b>Package</b>
<td> <b>Description</b>
<tr>
<tr>
<td> <a href = "src/gen_scalation/dynamics/"> gen_scalation.dynamics </a>
<td> A package containing DeMO to scalation.dynamics generators.
</table>
</blockquote>

<p>
</body>
</html>

