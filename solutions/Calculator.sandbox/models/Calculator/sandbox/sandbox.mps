<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:a1155c2f-17c9-48a5-bc43-9d2ce32420d4(Calculator.sandbox.sandbox)">
  <persistence version="7" />
  <language namespace="39883d10-6237-47b8-aa08-556ca7e83f96(Calculator)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="mze9" modelUID="r:6f7d6ac0-5e2a-4d04-babb-e4cd17e1d6b8(Calculator.structure)" version="-1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <roots>
    <node type="mze9.Calculator" typeId="mze9.308658663625919301" id="308658663625919711">
      <property name="name" nameId="tpck.1169194664001" value="TestCalculator" />
    </node>
  </roots>
  <root id="308658663625919711">
    <node role="outputField" roleId="mze9.308658663625920450" type="mze9.OutputField" typeId="mze9.308658663625920442" id="308658663625926027">
      <node role="expression" roleId="mze9.308658663625923029" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="308658663625947200">
        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.MulExpression" typeId="tpee.1092119917967" id="308658663625947224">
          <node role="rightExpression" roleId="tpee.1081773367579" type="mze9.InputFieldReference" typeId="mze9.308658663625945569" id="308658663625947227">
            <link role="inputField" roleId="mze9.308658663625945570" targetNodeId="308658663625920441" resolveInfo="Ruby" />
          </node>
          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="308658663625947203">
            <property name="value" nameId="tpee.1068580320021" value="12" />
          </node>
        </node>
        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="308658663625947132">
          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.MulExpression" typeId="tpee.1092119917967" id="308658663625947088">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="308658663625947087">
              <property name="value" nameId="tpee.1068580320021" value="10" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="mze9.InputFieldReference" typeId="mze9.308658663625945569" id="308658663625947091">
              <link role="inputField" roleId="mze9.308658663625945570" targetNodeId="308658663625920439" resolveInfo="Java" />
            </node>
          </node>
          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.MulExpression" typeId="tpee.1092119917967" id="308658663625947156">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="308658663625947135">
              <property name="value" nameId="tpee.1068580320021" value="4" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="mze9.InputFieldReference" typeId="mze9.308658663625945569" id="308658663625947159">
              <link role="inputField" roleId="mze9.308658663625945570" targetNodeId="308658663625920440" resolveInfo="PHP" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="inputField" roleId="mze9.308658663625919722" type="mze9.InputField" typeId="mze9.308658663625919712" id="308658663625920439">
      <property name="name" nameId="tpck.1169194664001" value="Java" />
    </node>
    <node role="inputField" roleId="mze9.308658663625919722" type="mze9.InputField" typeId="mze9.308658663625919712" id="308658663625920440">
      <property name="name" nameId="tpck.1169194664001" value="PHP" />
    </node>
    <node role="inputField" roleId="mze9.308658663625919722" type="mze9.InputField" typeId="mze9.308658663625919712" id="308658663625920441">
      <property name="name" nameId="tpck.1169194664001" value="Ruby" />
    </node>
  </root>
</model>

